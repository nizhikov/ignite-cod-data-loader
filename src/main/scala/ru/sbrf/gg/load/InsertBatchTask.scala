package ru.sbrf.gg.load

import java.util.concurrent.atomic.AtomicInteger

import org.apache.ignite.transactions.TransactionConcurrency.PESSIMISTIC
import org.apache.ignite.transactions.TransactionIsolation.REPEATABLE_READ
import org.apache.ignite.{Ignite, IgniteCache}

/**
  */
class InsertBatchTask(val batch: Array[String], val tableInfo: TableInfo, val ignite: Ignite, val cache: IgniteCache[Any, Any],
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

        val txMgr = ignite.transactions()

        val tx = txMgr.txStart(PESSIMISTIC, REPEATABLE_READ)
        try {
            cache.putAll(batchMap)
            tx.commit();
        } finally {
            tx.close()
        }
    }

    override def taskName = "LoadTable"

    override def batchTaskName = "BatchInserted"
}
