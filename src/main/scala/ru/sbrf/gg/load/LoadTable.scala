package ru.sbrf.gg.load

import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.ExecutorService

import org.apache.ignite.cache.CacheAtomicityMode.TRANSACTIONAL
import org.apache.ignite.cache.CacheMode.PARTITIONED
import org.apache.ignite.configuration.CacheConfiguration
import org.apache.ignite.{Ignite, IgniteCache}

/**
  */
class LoadTable(val tableName: String, val dataRoot: String, val pool: ExecutorService,
    val ignite: Ignite, val poolSize: Int) extends ProcessTableFile {

    val counter = new AtomicInteger()

    val lock = new Object()

    var cache: IgniteCache[Any, Any] = _

    val txTimeout = System.getProperty("TX_TIMEOUT", "120000").toLong

    override def taskName: String = "LoadTable"

    override def start(tableInfo: TableInfo): Unit = {
        val cacheConfigProvider =
            Class.forName(
                System.getProperty("CACHE_CONFIG_PROVIDER", classOf[DefaultConfigurationProvider[Any, Any]].getName))

        val cacheConfig = cacheConfigProvider.newInstance().asInstanceOf[CacheConfigurationProvider[Any, Any]]
            .create(tableInfo.cacheName)

        cache = ignite.getOrCreateCache(cacheConfig)
    }

    override def processBatch(batch: Array[String], tableInfo: TableInfo, lineCount: Long, name: String): Unit = {
        pool.execute(new InsertBatchTask(batch, tableInfo, ignite, cache, lineCount, name, tableName, lock, counter,
            txTimeout))

        waitTasksToComplete()
    }

    override def finish(tableInfo: TableInfo): Unit = {
        /* no-op */
    }

    private def waitTasksToComplete(): Unit = {
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
