package ru.sbrf.gg.load

import java.util.concurrent.atomic.AtomicInteger

import org.apache.ignite.IgniteCache
import org.slf4j.LoggerFactory
import ru.sbrf.gg.load.builder.{Builders, ObjectBuilder}

/**
  */
class InsertBatchTask(batch: Array[String], tableInfo: TableInfo, cache: IgniteCache[Any, Any],
    lineCount: Long, name: String, tableName: String, lock: Object, counter: AtomicInteger) extends Runnable {
    private val logger = LoggerFactory.getLogger(this.getClass)

    override def run(): Unit =
        try {
            logger.info(s"[LoadTable][BatchPrepareStart][tableName:$tableName][file:$name][lineCount:$lineCount]")
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

            logger.info(s"[LoadTable][BatchPrepareFinish][tableName:$tableName][file:$name][lineCount:$lineCount][time2prepare:${(System.nanoTime()-wholeStart)/1000000.0}]")

            val start = System.nanoTime()
            cache.putAll(batchMap)
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
