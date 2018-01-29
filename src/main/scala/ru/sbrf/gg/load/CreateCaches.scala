package ru.sbrf.gg.load

import java.util.concurrent.ExecutorService
import java.util.concurrent.atomic.AtomicInteger

import org.apache.ignite.cache.CacheAtomicityMode.TRANSACTIONAL
import org.apache.ignite.cache.CacheMode.PARTITIONED
import org.apache.ignite.configuration.CacheConfiguration
import org.apache.ignite.{Ignite, IgniteCache}

/**
  */
class CreateCaches(val tableName: String, val dataRoot: String, val ignite: Ignite) extends ProcessTableFile {
    override def taskName: String = "CreateCaches"

    override def process(): Unit = {
        val tableInfo = findTableInfo(tableName)

        logger.info(s"[$taskName][tableName:$tableName][cacheName:${tableInfo.cacheName}]")

        val cacheConfigProvider =
            Class.forName(
                System.getProperty("CACHE_CONFIG_PROVIDER", classOf[DefaultConfigurationProvider[Any, Any]].getName))

        val cacheConfig = cacheConfigProvider.newInstance().asInstanceOf[CacheConfigurationProvider[Any, Any]]
            .create(tableInfo.cacheName)

        ignite.getOrCreateCache(cacheConfig)
    }

    override def start(tableInfo: TableInfo): Unit = {
        /* no-op */
    }

    override def processBatch(batch: Array[String], tableInfo: TableInfo, lineCount: Long, name: String): Unit = {
    }

    override def finish(tableInfo: TableInfo): Unit = {
        /* no-op */
    }
}
