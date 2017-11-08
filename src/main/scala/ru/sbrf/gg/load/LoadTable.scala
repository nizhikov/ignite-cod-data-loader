package ru.sbrf.gg.load

import java.io._
import java.util.Scanner
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.{ExecutorService, Phaser}

import org.apache.ignite.{Ignite, IgniteCache}
import org.slf4j.LoggerFactory

import scala.io.Source

/**
  */
class LoadTable(local: Boolean, tableName: String, dataRoot: String, pool: ExecutorService, val ignite: Ignite, val poolSize: Int) {
    private val logger = LoggerFactory.getLogger(this.getClass)

    val batchSize: Int = System.getProperty("BATCH_SIZE", "10000").toInt

    val fileName: String = System.getProperty("FILE_NAME", "")

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
                if (fileName == "" || fileName == name)
                    try {
                        loadFile(name, stream, tableInfo, cache)
                    } catch {
                        case e: Exception ⇒ logger.error(s"Error loading file $name:", e)
                    }
                else {
                    logger.info(s"[LoadTable][tableName:$tableName] Skip $name because loading only $fileName")
                }
            }

            logger.info(s"[LoadTable][tableName:$tableName] All files submitted for load")
        } else
            logger.warn(s"[LoadTable][tableName:$tableName] No files for table")
    }

    private def loadFile(name: String, stream: InputStream, tableInfo: TableInfo, cache: IgniteCache[Any, Any]): Unit = {
        logger.info(s"[LoadTable][FileLoadStart][tableName:$tableName][file:$name]")

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

                    pool.execute(new InsertBatchTask(batch, tableInfo, cache, lineCount, name, tableName, lock, counter))

                    waitTasksToComplete

                    batch = new Array[String](batchSize)
                    batchIndex = 0
                }

                line = reader.readLine
            }

            if (lineCount % batchSize != 0 && lineCount != 0) {
                pool.execute(new InsertBatchTask(batch, tableInfo, cache, lineCount, name, tableName, lock, counter))

                waitTasksToComplete
            }

            logger.info(s"[LoadTable][FileLoadFinish][tableName:$tableName][file:$name][lineCount:$lineCount]")
        } finally {
            reader.close
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
