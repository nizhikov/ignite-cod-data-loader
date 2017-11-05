package ru.sbrf.gg.load

import java.io.{File, InputStream}
import java.util
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.{ExecutorService, Phaser}

import org.apache.ignite.{Ignite, IgniteCache}
import org.slf4j.LoggerFactory
import ru.sbrf.gg.load.builder._

import scala.io.Source

/**
  */
class LoadTable(local: Boolean, tableName: String, dataRoot: String, pool: ExecutorService, val ignite: Ignite, val poolSize: Int) {
    private val logger = LoggerFactory.getLogger(this.getClass)

    val batchSize: Int = System.getProperty("BATCH_SIZE", "10000").toInt

    val doInsert: String = System.getProperty("INSERT_INTO_GG", "true")

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
        closeAfter(stream) { stream ⇒
            val reader = Source.fromInputStream(stream, "Cp1251").getLines

            var lineCount = 0

            var batch = new Array[String](batchSize)

            for (line ← reader) {
                batch(lineCount % batchSize) = line

                lineCount += 1

                if (lineCount % batchSize == 0 && lineCount != 0) {
                    logger.info(s"[LoadTable][BatchSubmit][tableName:$tableName][file:$name][lineCount:$lineCount]")
                    pool.submit(new InsertBatchTask(batch, tableInfo, cache, lineCount, name))
                    //new InsertBatchTask(batch, tableInfo, cache, lineCount, name).run()

                    batch = new Array[String](batchSize)

                    val currentBatchCnt = counter.incrementAndGet()

                    if (currentBatchCnt >= poolSize) {
                        lock.synchronized {
                            try {
                                //logger.info("All Threads are busy. Waiting batch finish...")
                                lock.wait()
                                //logger.info(s"Some batch finished. Continue to read file $name...")
                            } catch {
                                case e: InterruptedException  ⇒ e.printStackTrace()
                            }
                        }
                    }
                }
            }

            if (lineCount % batchSize != 0 && lineCount != 0)
                pool.submit(new InsertBatchTask(batch, tableInfo, cache, lineCount, name))

            logger.info(s"[LoadTable][FileLoadFinish][tableName:$tableName][file:$name][lineCount:$lineCount]")
        }
    }

    class InsertBatchTask(batch: Array[String], tableInfo: TableInfo, cache: IgniteCache[Any, Any], lineCount: Long,
        name: String) extends Runnable {
        override def run(): Unit =
            try {
                logger.info(s"[LoadTable][BatchPrepareStart][tableName:$tableName][file:$name][lineCount:$lineCount]")
                val batchMap = new util.HashMap[Any, Any](batch.length, 1)

//                var avg = 0d
//                var avg2 = 0d

                val keyBuilder: ObjectBuilder = value2builder(tableInfo.key)
                val valueBuilder: ObjectBuilder = value2builder(tableInfo.value)

                batch.foreach { str ⇒
                    if (str != null) {
                        val start = System.nanoTime()

                        val line = str.split("\\|", -1)

                        val start2 = System.nanoTime()

                        val key = keyBuilder.build(line, tableInfo)
                        val value = valueBuilder.build(line, tableInfo)

//                        avg += (System.nanoTime() - start)/1000000.0
//                        avg2 += (System.nanoTime() - start2)/1000000.0

                        batchMap.put(key, value)
                    }
                }

//                logger.info(s"Avg = ${avg}")
//                logger.info(s"Avg2 = ${avg2}")
                //14:44:51.181 [pool-1-thread-1] INFO ru.sbrf.gg.load.LoadTable - Avg = 8798.218473998897
                //14:44:51.181 [pool-1-thread-1] INFO ru.sbrf.gg.load.LoadTable - Avg2 = 6195.834078000055

                logger.info(s"[LoadTable][BatchPrepareFinish][tableName:$tableName][file:$name][lineCount:$lineCount]")

                val start = System.nanoTime()
                cache.putAll(batchMap)
                logger.info(s"[LoadTable][BatchInserted][tableName:$tableName][file:$name]" +
                    s"[lineCount:$lineCount][timeElapsed:${(System.nanoTime() - start)/1000000.0}]")
                counter.decrementAndGet()
                lock.synchronized {
                    lock.notify()
                }
            } catch {
                case e: Exception ⇒ logger.error(s"Error inserting batch. $name:", e)
            }
    }
}
