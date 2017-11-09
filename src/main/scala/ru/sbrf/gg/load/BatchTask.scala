package ru.sbrf.gg.load

import java.util.concurrent.atomic.AtomicInteger

import org.slf4j.{Logger, LoggerFactory}
import ru.sbrf.gg.load.builder.{Builders, ObjectBuilder}

/**
  * @author NIzhikov
  */
trait BatchTask extends Runnable {
    val logger: Logger = LoggerFactory.getLogger(this.getClass)

    override def run(): Unit = {
        try {
            val start = System.nanoTime()

            processBatch()

            logger.info(s"[$taskName][$batchTaskName][tableName:$tableName][file:$fileName]" +
                s"[lineCount:$lineCount][timeElapsed:${(System.nanoTime() - start)/1000000.0}]")
        } catch {
            case e: Exception ⇒ logger.error(s"Error inserting batch. $fileName:", e)
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