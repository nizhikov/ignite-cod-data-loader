package ru.sbt;

import com.sbt.cdm.api.model.published.instance.PublishedProductParty;
import com.sbt.dpl.gridgain.AffinityParticleKey;
import java.util.Iterator;
import java.util.LinkedList;
import javax.cache.Cache;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteLogger;
import org.apache.ignite.binary.BinaryObject;
import org.apache.ignite.cache.query.QueryCursor;
import org.apache.ignite.cache.query.ScanQuery;
import org.apache.ignite.lang.IgniteFuture;
import org.apache.ignite.lang.IgniteRunnable;
import org.apache.ignite.resources.IgniteInstanceResource;
import org.apache.ignite.resources.LoggerResource;

/**
 *
 */
public class PartitionJob implements IgniteRunnable {
    private String cacheName;

    private int partition;

    private int processOneOf;

    private int maxRunningJobs;

    private long waitForJobs;

    private LinkedList<IgniteFuture<Integer>> jobs = new LinkedList<>();

    @IgniteInstanceResource
    private Ignite ignite;

    @LoggerResource
    private IgniteLogger igniteLogger;

    public PartitionJob(String cacheName, int partition, int processOneOf, int maxRunningJobs, long waitForJobs) {
        this.cacheName = cacheName;
        this.partition = partition;
        this.processOneOf = processOneOf;
        this.maxRunningJobs = maxRunningJobs;
        this.waitForJobs = waitForJobs;
    }

    @Override public void run() {
        igniteLogger.info("[Remote][partition:" + partition + "][cacheName:" + cacheName + "][Start]");

        IgniteCache<AffinityParticleKey, PublishedProductParty> productCache = ignite.cache(cacheName);

        try (QueryCursor<Cache.Entry<AffinityParticleKey, PublishedProductParty>> query =
                productCache.query(new ScanQuery<AffinityParticleKey, PublishedProductParty>(partition))) {

            int cnt = 0;
            int jobsRunning = 0;
            int jobsStarted = 0;
            for (Cache.Entry<AffinityParticleKey, PublishedProductParty> entry : query) {
                if (++cnt % processOneOf == 0) {
                    igniteLogger.info("[Remote][StartJob4Record][partition:" + partition + "][cnt:" + cnt + "]" +
                        "[key:" +  entry.getKey() + "]");

                    jobsRunning++;
                    jobsStarted++;

                    IgniteFuture<Integer> fut = ignite.compute().affinityCallAsync(cacheName, entry.getKey(),
                        new RecordJob(cacheName, entry.getKey()));

                    jobs.add(fut);

                    if (jobsStarted == 3)
                        break;

                    if (jobsStarted % 1_000 == 0)
                        igniteLogger.info("[Remote][partition:" + partition + "]" +
                            "[jobsStarted:" + jobsStarted + "]");

                    while (jobsRunning >= maxRunningJobs) {
                        igniteLogger.info("[Remote][partition:" + partition + "]" +
                            "[jobsRunning:" + jobsRunning + "] - checking for finished jobs.");

                        removeFinished();
                        jobsRunning = jobs.size();

                        if (jobsRunning >= maxRunningJobs) {
                            igniteLogger.info("[Remote][partition:" + partition + "]" +
                                "[jobsRunning:" + jobsRunning + "] - sleeping for a " + (waitForJobs/1000) + " sec.");
                            try {
                                Thread.sleep(waitForJobs);
                            }
                            catch (InterruptedException e) {
                                igniteLogger.error("InterruptedException:", e);
                            }
                        }
                    }
                }
            }
        }

        igniteLogger.info("[Remote][partition:" + partition + "][cacheName:" + cacheName + "][Finish]");
    }

    private void removeFinished() {
        Iterator<IgniteFuture<Integer>> iter = jobs.iterator();

        while (iter.hasNext()) {
            IgniteFuture<Integer> job = iter.next();
            if (job.isDone())
                iter.remove();
        }
    }
}
