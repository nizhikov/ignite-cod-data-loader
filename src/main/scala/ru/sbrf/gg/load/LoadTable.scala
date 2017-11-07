package ru.sbrf.gg.load

import java.io.{File, InputStream}
import java.text.SimpleDateFormat
import java.util
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.{ExecutorService, Phaser}

import com.sbt.DelimetedStringParser
import org.apache.ignite.{Ignite, IgniteCache}
import org.slf4j.LoggerFactory
import ru.sbrf.gg.load.builder.{Builders, ObjectBuilder, PublishedProductPartyBuilder}

import scala.io.Source

/**
  */
class LoadTable(local: Boolean, tableName: String, dataRoot: String, pool: ExecutorService, val ignite: Ignite, val poolSize: Int) {
    private val logger = LoggerFactory.getLogger(this.getClass)

    val batchSize: Int = System.getProperty("BATCH_SIZE", "10000").toInt

    val doInsert: String = System.getProperty("INSERT_INTO_GG", "true")

    val maxLines = System.getProperty("MAX_LINES", "-1").toInt

    val counter = new AtomicInteger()
    val lock = new Object()

    def load(): Unit = {
        logger.info(s"[LoadTable][tableName:$tableName][local:$local][dataRoot:$dataRoot]")

        val tableInfo = findTableInfo(tableName)

        val cache: IgniteCache[Any, Any] = ignite.getOrCreateCache(tableInfo.cacheName)

        val fileIterator = if (new File(dataRoot).isDirectory)
            directoryIterator(dataRoot)
        else
            zipIterator(dataRoot)

        val tableFiles = fileIterator.filter { case (name, stream) ⇒
            name.toLowerCase().matches(tableInfo.fileMask)
        }

        if (tableFiles.nonEmpty) {
            tableFiles.foreach { case (name, stream) ⇒
                try {
                    loadFile(name, stream, tableInfo, cache)
                } catch {
                    case e: Exception ⇒ logger.error(s"Error loading file $name:", e)
                }
            }

            logger.info(s"[LoadTable][tableName:$tableName] All files submitted for load")
        } else
            logger.warn(s"[LoadTable][tableName:$tableName] No files for table")
    }

    private def loadFile(name: String, stream: InputStream, tableInfo: TableInfo, cache: IgniteCache[Any, Any]): Unit = {
        logger.info(s"[LoadTable][FileLoadStart][tableName:$tableName][file:$name]")

        try {
            val reader = Source.fromInputStream(stream, "Cp1251").getLines

            var lineCount = 0

            var batch = new Array[String](batchSize)

            while (reader.hasNext && (maxLines == -1 || maxLines >= lineCount)) {
                batch(lineCount % batchSize) = reader.next

                lineCount += 1

                if (lineCount % batchSize == 0 && lineCount != 0) {
                    logger.info(s"[LoadTable][BatchSubmit][tableName:$tableName][file:$name][lineCount:$lineCount]")
                    pool.execute(new InsertBatchTask(batch, tableInfo, cache, lineCount, name, tableName, lock, counter))

                    waitTasksToComplete

                    batch = new Array[String](batchSize)

                }
            }

            if (lineCount % batchSize != 0 && lineCount != 0) {
                waitTasksToComplete
                pool.execute(new InsertBatchTask(batch, tableInfo, cache, lineCount, name, tableName, lock, counter))

            }

            logger.info(s"[LoadTable][FileLoadFinish][tableName:$tableName][file:$name][lineCount:$lineCount]")
        }
        finally {
            stream.close
        }
    }

    private def waitTasksToComplete = {
        lock.synchronized {
            try {
                val currentBatchCnt = counter.incrementAndGet()

                if (currentBatchCnt >= poolSize) {
                    lock.wait()
                }
            }
            catch {
                case e: InterruptedException ⇒ e.printStackTrace()
            }
        }
    }
}
