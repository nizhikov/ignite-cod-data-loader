package ru.sbrf.gg.load

import java.util.concurrent.atomic.AtomicInteger

import org.apache.ignite.IgniteCache
import org.slf4j.LoggerFactory
import ru.sbrf.gg.load.builder.{Builders, ObjectBuilder}

/**
  */
class InsertBatchTask(val batch: Array[String], val tableInfo: TableInfo, val cache: IgniteCache[Any, Any],
    val lineCount: Long, val fileName: String, val tableName: String, val lock: Object, val counter: AtomicInteger) extends BatchTask {

    def processBatch(): Unit = {
        val batchMap = new java.util.HashMap[Any, Any](batch.length, 1)

        batch.foreach { str ⇒
            if (str != null) {
                val key = keyBuilder.build(str, tableInfo)
                val value = valueBuilder.build(str, tableInfo)

                batchMap.put(key, value)
            }
        }

        cache.putAll(batchMap)
    }

    override def taskName = "LoadTable"

    override def batchTaskName = "BatchInserted"
}
