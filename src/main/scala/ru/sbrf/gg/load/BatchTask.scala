package ru.sbrf.gg.load

import java.util.concurrent.atomic.AtomicInteger

import org.apache.log4j.Logger
import ru.sbrf.gg.load.builder.{Builders, ObjectBuilder}

/**
  * @author NIzhikov
  */
trait BatchTask extends Runnable {
    val logger: Logger = Logger.getLogger(this.getClass)

    override def run(): Unit = {
        try {
            val start = System.nanoTime()

            processBatch()

            logger.info(s"[$taskName][$batchTaskName][tableName:$tableName][file:$fileName]" +
                s"[lineCount:$lineCount][timeElapsed:${(System.nanoTime() - start)/1000000.0}]")
        } catch {
            case e: Exception ⇒ {
                var root: Throwable = e
                while (root != null) {
                    logger.error(s"Error inserting batch. $fileName:", root)
                    root = root.getCause
                }
            }
        } finally {
            lock.synchronized {
                counter.getAndDecrement()

                lock.notify()
            }
        }
    }

    def keyBuilder: ObjectBuilder = Builders.builders.get(tableInfo.key)

    def valueBuilder: ObjectBuilder = Builders.builders.get(tableInfo.value)

    def processBatch(): Unit

    def taskName: String

    def batchTaskName: String

    def batch(): Array[String]

    def tableInfo: TableInfo

    def lineCount: Long

    def fileName: String

    def tableName: String

    def lock: Object

    def counter: AtomicInteger
}
