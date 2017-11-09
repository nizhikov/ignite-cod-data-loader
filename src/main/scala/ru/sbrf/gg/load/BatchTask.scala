package ru.sbrf.gg.load

import java.util.concurrent.atomic.AtomicInteger

import org.apache.ignite.IgniteCache
import org.slf4j.LoggerFactory
import ru.sbrf.gg.load.builder.{Builders, ObjectBuilder}

/**
  * @author NIzhikov
  */
trait BatchTask extends Runnable {
    val logger = LoggerFactory.getLogger(this.getClass)

    override def run(): Unit = {
        try {
            val batchMap = new java.util.HashMap[Any, Any](batch.length, 1)

            val keyBuilder: ObjectBuilder = Builders.builders.get(tableInfo.key)
            val valueBuilder: ObjectBuilder = Builders.builders.get(tableInfo.value)

            val wholeStart = System.nanoTime()

            batch.foreach { str ⇒
                if (str != null) {
                    val key = keyBuilder.build(str, tableInfo)
                    val value = valueBuilder.build(str, tableInfo)

                    batchMap.put(key, value)
                }
            }

            val start = System.nanoTime()
            cache.putAll(batchMap) //TODO: implement me.
            logger.info(s"[LoadTable][BatchInserted][tableName:$tableName][file:$name]" +
                s"[lineCount:$lineCount][timeElapsed:${(System.nanoTime() - start)/1000000.0}]")
        } catch {
            case e: Exception ⇒ logger.error(s"Error inserting batch. $name:", e)
        } finally {
            lock.synchronized {
                val value = counter.getAndDecrement()
                lock.notify()
            }
        }
    }

    def batch: Array[String]

    def tableInfo: TableInfo

    def cache: IgniteCache[Any, Any]

    def lineCount: Long

    def name: String

    def tableName: String

    def lock: Object

    def counter: AtomicInteger
}
