package ru.sbrf.gg.load

import java.util

import org.apache.ignite.Ignite
import org.apache.ignite.lang.IgniteFuture
import org.slf4j.LoggerFactory
import ru.sbt.PartitionJob

import scala.collection.JavaConversions._

/**
  */
class StartComputeJob(ignite: Ignite) extends Runnable {
    private val logger = LoggerFactory.getLogger(this.getClass)

    private val processOneOf: Int = System.getProperty("ONE_OF", "3").toInt

    private val maxRunningJobs: Int = System.getProperty("MAX_RUNNING_JOBS", "100").toInt

    private val maxRunningParts: Int = System.getProperty("MAX_RUNNING_PARTS", "5").toInt

    private val waitForParts = System.getProperty("WAIT_FOR_PARTS", "60000").toLong

    private val waitForJobs = System.getProperty("WAIT_FOR_JOBS", "2500").toLong


    override def run(): Unit = {
        logger.info("[Start]")

        val tableInfo = findTableInfo("EIP_DBAOSB_PRODUCT")

        val partitionsCount = ignite.affinity(tableInfo.cacheName).partitions()

        logger.info(s"[CacheInfoFound][partitionsCount:$partitionsCount]")

        val jobs = new util.LinkedList[IgniteFuture[Void]]()

        var runningParts = 0
        var partition = 0
        while(partition != partitionsCount) {
            val fut = ignite.compute().affinityRunAsync(
                tableInfo.cacheName,
                partition,
                new PartitionJob(tableInfo.cacheName, partition, processOneOf, maxRunningJobs, waitForJobs))

            jobs.add(fut)

            logger.info(s"[PartitionJobSubmitted][partition:$partition]")

            partition += 1
            runningParts += 1

            if (runningParts >= maxRunningParts) {
                waitJobs2Finish(jobs, maxRunningParts)
                runningParts = jobs.size()
            }
        }

        logger.info(s"[TaskForAllPartitionSubmitted][partitionsCount:$partitionsCount]")

        logger.info(s"[AllJobsAreDone]")
    }

    def waitJobs2Finish(jobs: util.LinkedList[IgniteFuture[Void]], maxCount: Int): Unit = {
        removeFinished(jobs)
        var notFinished = jobs.size()

        while(notFinished >= maxCount) {
            logger.info(s"[WaitingForPartsFinish][notFinished:$notFinished] - sleeping for ${waitForParts/1000} sec")

            Thread.sleep(waitForParts)

            removeFinished(jobs)
            notFinished = jobs.size()
        }
    }

    def removeFinished(jobs: util.LinkedList[IgniteFuture[Void]]): Unit = {
        val iter = jobs.iterator()

        while (iter.hasNext()) {
            val job = iter.next()
            if (job.isDone())
                iter.remove()
        }
    }
}
