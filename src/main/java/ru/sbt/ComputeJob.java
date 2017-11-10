package ru.sbt;

import javax.cache.Cache;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteLogger;
import org.apache.ignite.binary.BinaryObject;
import org.apache.ignite.cache.query.QueryCursor;
import org.apache.ignite.cache.query.ScanQuery;
import org.apache.ignite.lang.IgniteRunnable;
import org.apache.ignite.resources.IgniteInstanceResource;
import org.apache.ignite.resources.LoggerResource;

/**
 *
 */
public class ComputeJob implements IgniteRunnable {
    private String cacheName;

    private int partition;

    @IgniteInstanceResource
    Ignite ignite;

    @LoggerResource
    IgniteLogger igniteLogger;

    public ComputeJob(String cacheName, int partition) {
        this.cacheName = cacheName;
        this.partition = partition;
    }

    @Override public void run() {
        igniteLogger.info("[ExecuteComputeJob][Remote][partition:$partition] - ${cacheName} - $ignite");

        IgniteCache<BinaryObject, BinaryObject> productCache = ignite.cache(cacheName).withKeepBinary();

        try (
            QueryCursor<Cache.Entry<BinaryObject, BinaryObject>> query =
                productCache.query(new ScanQuery<BinaryObject, BinaryObject>(partition))) {
            for (Cache.Entry<BinaryObject, BinaryObject> entry : query) {
                igniteLogger.info("Product[" + entry.getValue().field("id") + "] - " + entry.getKey());
            }
        }
    }
}
