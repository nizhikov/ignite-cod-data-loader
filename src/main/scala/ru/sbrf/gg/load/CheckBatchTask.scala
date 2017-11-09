package ru.sbrf.gg.load

import java.util.concurrent.atomic.AtomicInteger

import org.apache.ignite.{Ignite, IgniteCache}

import scala.collection.JavaConversions._

/**
  */
class CheckBatchTask(val batch: Array[String], val tableInfo: TableInfo, ignite: Ignite, val cache: IgniteCache[Any, Any],
    val lineCount: Long, val fileName: String, val tableName: String, val lock: Object, val counter: AtomicInteger) extends BatchTask {

    var errorFound = false

    def processBatch(): Unit = {
        val batchMap = new java.util.HashMap[Any, Any](batch.length, 1)

        batch.foreach { str ⇒
            if (str != null) {
                val key = keyBuilder.build(str, tableInfo)
                val value = valueBuilder.build(str, tableInfo)

                batchMap.put(key, value)
            }
        }

        val dataFromCache = cache.getAll(batchMap.keySet())

        if (dataFromCache.size() != batchMap.size()) {
            logger.warn(s"[$taskName][$batchTaskName][Error.DataSizeDiffers][lineCount:$lineCount][expected:${batch.length}][fromCache:${dataFromCache.size()}]")
            errorFound = true
        }

        batchMap.entrySet().foreach { entry ⇒
            if (!dataFromCache.containsKey(entry.getKey)) {
                logger.warn(s"[$taskName][$batchTaskName][Error.KeyNotFound][lineCount:$lineCount][key=${entry.getKey}]")
                errorFound = true
            } else  if (valueBuilder.compare(entry.getValue, dataFromCache.get(entry.getKey)) != 0) {
                logger.warn(s"[$taskName][$batchTaskName][Error.ValueNotEquals][lineCount:$lineCount][key=${entry.getKey}]")
                errorFound = true
            }
        }

        if (!errorFound)
            logger.info(s"[$taskName][$batchTaskName][OK][lineCount:$lineCount]")
    }

    override def taskName = "CheckTable"

    override def batchTaskName = "BatchChecked"
}
