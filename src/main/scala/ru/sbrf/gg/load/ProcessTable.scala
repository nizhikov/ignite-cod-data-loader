package ru.sbrf.gg.load

import java.io.{BufferedReader, File, InputStream, InputStreamReader}
import java.util.concurrent.ExecutorService
import java.util.concurrent.atomic.AtomicInteger

import org.apache.ignite.{Ignite, IgniteCache}
import org.slf4j.LoggerFactory

/**
  * @author NIzhikov
  */
trait ProcessTable {
    val logger = LoggerFactory.getLogger(this.getClass)

    val batchSize: Int = System.getProperty("BATCH_SIZE", "10000").toInt

    val fileName: String = System.getProperty("FILE_NAME", "")

    def process(): Unit = {
        logger.info(s"[$taskName][tableName:$tableName][local:$local][dataRoot:$dataRoot]")

        val tableInfo = findTableInfo(tableName)

        start(tableInfo)

        val fileIterator = if (new File(dataRoot).isDirectory)
            directoryIterator(dataRoot)
        else
            zipIterator(dataRoot)

        val tableFiles = fileIterator.filter { case (name, stream) ⇒
            name.toLowerCase().matches(tableInfo.fileMask)
        }

        if (tableFiles.nonEmpty) {
            tableFiles.foreach { case (name, stream) ⇒
                if (fileName == "" || fileName == name)
                    try {
                        loadFile(name, stream, tableInfo)
                    } catch {
                        case e: Exception ⇒ logger.error(s"Error loading file $name:", e)
                    }
                else {
                    logger.info(s"[$taskName][tableName:$tableName] Skip $name because loading only $fileName")
                }
            }

            logger.info(s"[$taskName][tableName:$tableName] All files submitted for load")
        } else
            logger.warn(s"[$taskName][tableName:$tableName] No files for table")

        finish(tableInfo)
    }

    private def loadFile(name: String, stream: InputStream, tableInfo: TableInfo): Unit = {
        logger.info(s"[$taskName][FileLoadStart][tableName:$tableName][file:$name]")

        val reader = new BufferedReader(new InputStreamReader(stream, "Cp1251"), 4*1024*1024)
        try {
            var lineCount: Long = 0L
            var batchIndex: Int = 0

            var batch = new Array[String](batchSize)

            var line = reader.readLine()
            while (line != null) {
                batch(batchIndex) = line

                lineCount += 1
                batchIndex += 1

                if (batchIndex == batchSize && lineCount != 0) {
                    logger.debug(s"[LoadTable][BatchSubmit][tableName:$tableName][file:$name][lineCount:$lineCount]")

                    processBatch(batch, tableInfo, lineCount, name)

                    batch = new Array[String](batchSize)
                    batchIndex = 0
                }

                line = reader.readLine
            }

            if (lineCount % batchSize != 0 && lineCount != 0)
                processBatch(batch, tableInfo, lineCount, name)

            logger.info(s"[$fileName][FileLoadFinish][tableName:$tableName][file:$name][lineCount:$lineCount]")
        } finally {
            reader.close
            stream.close
        }
    }

    def taskName: String

    def start(tableInfo: TableInfo): Unit

    def processBatch(batch: Array[String], tableInfo: TableInfo, lineCount: Long, name: String): Unit

    def finish(tableInfo: TableInfo): Unit

    def local: Boolean

    def tableName: String

    def dataRoot: String
}
