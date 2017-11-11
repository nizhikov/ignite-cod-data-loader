package ru.sbt;

import com.sbt.cdm.api.model.published.instance.PublishedPerformedOperation;
import com.sbt.cdm.api.model.published.instance.PublishedPerformedService;
import com.sbt.cdm.api.model.published.instance.PublishedProductParty;
import com.sbt.cdm.model.extension.deposit.DepoHist;
import com.sbt.dpl.gridgain.AffinityParticleKey;
import java.math.BigDecimal;
import java.util.Random;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteAtomicSequence;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteLogger;
import org.apache.ignite.IgniteTransactions;
import org.apache.ignite.lang.IgniteCallable;
import org.apache.ignite.resources.IgniteInstanceResource;
import org.apache.ignite.resources.LoggerResource;
import org.apache.ignite.transactions.Transaction;
import ru.sbrf.gg.load.TableInfo;
import ru.sbrf.gg.load.builder.DepoHistBuilder;
import ru.sbrf.gg.load.builder.PublishedPerformedOperationBuilder;
import ru.sbrf.gg.load.builder.PublishedPerformedServiceBuilder;

import static org.apache.ignite.transactions.TransactionConcurrency.PESSIMISTIC;
import static org.apache.ignite.transactions.TransactionIsolation.REPEATABLE_READ;

/**
 */
public class RecordJob implements IgniteCallable<Integer> {
    private String productCacheName;

    private AffinityParticleKey key;

    Random random = new Random();

    @IgniteInstanceResource
    private Ignite ignite;

    @LoggerResource
    private IgniteLogger igniteLogger;

    PublishedPerformedOperationBuilder operationBuilder = new PublishedPerformedOperationBuilder();

    DepoHistBuilder depoHistBuilder = new DepoHistBuilder();

    PublishedPerformedServiceBuilder serviceBuilder = new PublishedPerformedServiceBuilder();

    private TableInfo operationInfo = new TableInfo(AffinityParticleKey.class, PublishedPerformedOperation.class,
        "com.sbt.cdm.api.model.published.instance.PublishedPerformedOperation", "*");

    private TableInfo depoHistInfo = new TableInfo(AffinityParticleKey.class, DepoHist.class,
        "DepoHist_DPL_union-module", "*");

    private TableInfo serviceInfo = new TableInfo(AffinityParticleKey.class, PublishedPerformedService.class,
        "com.sbt.cdm.api.model.published.instance.PublishedPerformedService", "*");

    public RecordJob(String productCacheName, AffinityParticleKey key) {
        this.productCacheName = productCacheName;
        this.key = key;
    }

    @Override public Integer call() {
        igniteLogger.info("[RecordJob][Remote][key:" + key + "][Start]");

        IgniteCache<AffinityParticleKey, PublishedProductParty> productCache = ignite.cache(productCacheName);

        IgniteCache<AffinityParticleKey, PublishedPerformedService> performedServiceCache =
            ignite.cache(serviceInfo.cacheName);

        IgniteCache<AffinityParticleKey, PublishedPerformedOperation> performedOperationCache =
            ignite.cache(operationInfo.cacheName);

        IgniteCache<AffinityParticleKey, DepoHist> depoHistCache =
            ignite.cache(depoHistInfo.cacheName);

        final IgniteTransactions txMgr = ignite.transactions();

        IgniteAtomicSequence idGen = ignite.atomicSequence("IG_GENERATOR", 22_08_1984L, true);

        try (Transaction tx = txMgr.txStart(PESSIMISTIC, REPEATABLE_READ)) {
            AffinityParticleKey _key = key; //.deserialize();
            PublishedProductParty product = productCache.get(_key);

            product.sum = new BigDecimal(random.nextDouble() % 1_000_000d);

            productCache.put(_key, product);

            createPerformedService(_key, performedServiceCache, idGen);

            int operationCnt = random.nextInt(35);
            for (int i = 0; i < operationCnt; i++)
                createPerformedOperation(key, performedOperationCache, idGen);

            int depoHistCnt = random.nextInt(3);
            for (int i = 0; i < depoHistCnt; i++)
                createDepoHist(key, depoHistCache, idGen);

            tx.commit();
        }


        igniteLogger.info("[RecordJob][Remote][key:" + key + "][Finish]");
        return 0;
    }

    private void createPerformedService(AffinityParticleKey productKey,
        IgniteCache<AffinityParticleKey, PublishedPerformedService> cache,
        IgniteAtomicSequence idGen) {
        String str = "-9223372036694210480|190|13345255||505|84||13345255||-9223372036849811415||348||||29.04.2010 00:00:00|29.04.2010 00:00:00||||672||||1385950103||4|1";

        AffinityParticleKey key = new AffinityParticleKey(idGen.getAndIncrement(), productKey.getPartitionId(),
            productKey.getRootId());
        PublishedPerformedService service = (PublishedPerformedService)serviceBuilder.build(str, serviceInfo);

        cache.put(key, service);
    }

    private void createPerformedOperation(AffinityParticleKey productKey,
        IgniteCache<AffinityParticleKey, PublishedPerformedOperation> cache,
        IgniteAtomicSequence idGen) {
        String str = "-9223372036691556560|199|4316796|||711|10001||680|50|-9223372036693776169|4316796|-9223372036849533815|-9223372036849533047|-9223372036811026159|30.09.2006 00:00:00|30.09.2006 00:00:00|13859585954||4|-9223372036692795175|1";

        AffinityParticleKey key = new AffinityParticleKey(idGen.getAndIncrement(), productKey.getPartitionId(),
            productKey.getRootId());
        PublishedPerformedOperation operation = (PublishedPerformedOperation)operationBuilder.build(str, operationInfo);

        cache.put(key, operation);
    }

    private void createDepoHist(AffinityParticleKey productKey,
        IgniteCache<AffinityParticleKey, DepoHist> cache, IgniteAtomicSequence idGen) {
        String str = "-9223372036692795184|215|4295657|-9223372036691556057|||||||||||.0|239.86|.0||8595|01.01.1800 00:00:00|||101||||||01.01.1800 00:00:00|.0|.0|.0||||0|13||.0|.0||||0||||.0|.0|85954||.06|.0|383|30.09.2006 00:00:00|5000.0|8|35|30.09.2006 00:00:00|||.0||.0||||01.01.1800 00:00:00|||23.02.1980 00:00:00||0|01.01.1800 00:00:00||||0|||.0|.0|1|2|.0||||||||||||||||||4||||||||||1";

        AffinityParticleKey key = new AffinityParticleKey(idGen.getAndIncrement(), productKey.getPartitionId(),
            productKey.getRootId());
        DepoHist depoHist = (DepoHist)depoHistBuilder.build(str, depoHistInfo);

        cache.put(key, depoHist);
    }
}
