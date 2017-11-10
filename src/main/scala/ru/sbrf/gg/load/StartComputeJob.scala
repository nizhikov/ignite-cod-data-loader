package ru.sbrf.gg.load

import org.apache.ignite.Ignite
import org.slf4j.LoggerFactory
import ru.sbt.ComputeJob

/**
  */
class StartComputeJob(ignite: Ignite) extends Runnable {
    private val logger = LoggerFactory.getLogger(this.getClass)

    override def run() = {
        logger.info("[ExecuteComputeJob][Start]")

        val tableInfo = findTableInfo("EIP_DBAOSB_PRODUCT")

        val partitionsCount = ignite.affinity(tableInfo.cacheName).partitions()

        logger.info(s"[ExecuteComputeJob][CacheInfoFound][partitionsCount:$partitionsCount]")

        for (partition ← 0 to partitionsCount) {
            ignite.compute().affinityRunAsync(
                tableInfo.cacheName,
                partition,
                new ComputeJob(tableInfo.cacheName, partition))
        }

        logger.info(s"[ExecuteComputeJob][TaskForAllPartitionSubmitted][partitionsCount:$partitionsCount]")
    }
}
