package ru.sbrf.gg.load

import java.io.{File, InputStream}
import java.lang.reflect.Field
import java.util
import java.util.concurrent.ExecutorService

import com.sbt.dpl.gridgain.AffinityParticleKey
import org.apache.ignite.{Ignite, IgniteCache}
import org.slf4j.LoggerFactory
import ru.sbt.kmdtransform._

import scala.xml.{Node, XML}

/**
  */
class LoadTable(local: Boolean, tableName: String, dataRoot: String, pool: ExecutorService, val ignite: Ignite) {
    val logResolution: Long = System.getProperty("LOG_RESOLUTION", "100000").toLong

    val batchSize: Int = System.getProperty("BATCH_SIZE", "10000").toInt

    private val logger = LoggerFactory.getLogger(this.getClass)

    def load(): Unit = {
        logger.info(s"LoadTable.load: local=$local, tableName=$tableName, dataRoot=$dataRoot")

        val tableInfo = findTableInfo(tableName)

        val cache: IgniteCache[Any, Any] = ignite.getOrCreateCache(tableInfo.cacheName)

        val fileIterator = if (new File(dataRoot).isDirectory)
            directoryIterator(dataRoot)
        else
            zipIterator(dataRoot)

        val tableFiles = fileIterator.filter { case (name, stream) ⇒
            name.matches(tableInfo.fileMask)
        }

        if (tableFiles.nonEmpty) {
            tableFiles.foreach { case (name, stream) ⇒
                pool.submit(new Runnable {
                    override def run(): Unit =
                        try {
                            loadFile(name, stream, tableInfo, cache)
                        } catch {
                            case e: Exception ⇒ logger.error(s"Error loading file $name:", e)
                        }
                })
            }

            logger.info(s"All files for $tableName submitted for load")
        } else
            logger.warn(s"No files for table $tableName")
    }

    private def loadFile(name: String, stream: InputStream, tableInfo: TableInfo, cache: IgniteCache[Any, Any]): Unit = {
        logger.info(s"Start loading file $name")
        closeAfter(stream) { stream ⇒
            val reader = new CSVReader(stream, "\\|", "Cp1251")

            var lineCount = 0

            var batch = new util.HashMap[Any, Any]()

            for (line ← reader) {
                lineCount += 1
                if (lineCount % logResolution == 0)
                    logger.info(s"Loading file $name - $lineCount")

                if (lineCount % batchSize == 0 && lineCount != 0) {
                    logger.debug(s"Inserting batch into $tableName, $name - " + lineCount)
                    val start = System.nanoTime()
                    cache.putAll(batch)
                    logger.info(s"Batch inserted into $tableName, $name - " + lineCount +
                        s", timeElapsed - ${(System.nanoTime() - start)/1000000.0} msec")
                    batch = new util.HashMap[Any, Any]()
                }

                batch.put(buildKey(line, tableInfo.key, tableInfo.value), buildObject(line, tableInfo.value))
            }

            if (lineCount % batchSize != 0 && lineCount != 0)
                cache.putAll(batch)

            logger.info(s"File $name loaded - $lineCount")
        }
    }

    private def findTableInfo(tableName: String): TableInfo = {
        def findTransform0(fileTag: Node): TableInfo = {
            val name = (fileTag \ "tableName").text

            val transformConfig = XML.load(
                getClass.getResourceAsStream("/distrib_src_main_resource_config_gg-eip.xml"))

            val table = (transformConfig \ "tables" \ "table").find(node ⇒ (node \ "name").text == name)

            table match {
                case Some(t) ⇒
                    val keyType = Class.forName((t \ "key_data_type").text)
                    val valueType = Class.forName((t \ "object_data_type").text)

                    val fileMask = (fileTag \ "filesMask").text.replaceAll("\\*", ".*")

                    TableInfo(keyType, valueType, (t \ "cache_name").text, fileMask)
                case None ⇒
                    throw new RuntimeException(s"Transform config for table $tableName not found")
            }
        }

        val loaderConfig = XML.load(
            getClass.getResourceAsStream("/distrib_src_main_resource_config_LoaderConfig.xml"))

        val fileTags = loaderConfig \ "loader" \ "type" \ "filesWithId" \ "files" \ "file"

        val name2find = tableName.substring(tableName.lastIndexOf('_') + 1)

        fileTags.find { node ⇒ name2find == (node \ "tableName").text } match {
            case Some(fileTag) ⇒
                findTransform0(fileTag)
            case None ⇒
                throw new RuntimeException(s"Settings for table $tableName not found")
        }
    }

    def buildKey(line: Array[String], key: Class[_], value: Class[_]): Any = {
        if (key != classOf[AffinityParticleKey])
            throw new RuntimeException("Not AffinityParticle Key!!!")

        val id = value.getFields.find(_.isAnnotationPresent(classOf[IdField])).map { f ⇒
            fieldValue(line, f).asInstanceOf[Long]
        }.getOrElse(throw new RuntimeException(s"Can't find IdField annotation for $value"))

        val partitionId  = value.getFields.find(_.isAnnotationPresent(classOf[PartField])).map { f ⇒
            fieldValue(line, f).asInstanceOf[Long]
        }.getOrElse(throw new RuntimeException(s"Can't find PartField annotation for $value"))

        val rootId  = value.getFields.find(_.isAnnotationPresent(classOf[RootField])).map { f ⇒
            fieldValue(line, f).asInstanceOf[Long]
        }.getOrElse(throw new RuntimeException(s"Can't find RootField annotation for $value"))

        new AffinityParticleKey(id, partitionId, rootId)
    }

    def buildObject[T](line: Array[String], valueClazz: Class[T]): T = {
        val result = valueClazz.newInstance

        val fields = valueClazz.getFields.filter(f ⇒ f.isAnnotationPresent(classOf[InitOrder]))

        fields.foreach { f ⇒ f.set(result, fieldValue(line, f)) }

        result
    }

    def fieldValue(line: Array[String], field: Field): Any = {
        var fieldValueStr = line(field.getAnnotation(classOf[InitOrder]).value().toInt - 1)

        if (fieldValueStr == null || fieldValueStr == "" && field.isAnnotationPresent(classOf[Default]))
            fieldValueStr = field.getAnnotation(classOf[Default]).value()

        if (!field.isAnnotationPresent(classOf[DataType]))
            throw new RuntimeException(s"there is no DatType annotation for field ${field.getName} " +
                s"of class ${field.getDeclaringClass.getName}")

        val dataType = field.getAnnotation(classOf[DataType]).value()
        dataType.fromStr(fieldValueStr)
    }
}
