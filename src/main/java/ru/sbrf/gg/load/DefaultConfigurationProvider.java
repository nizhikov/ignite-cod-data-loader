package ru.sbrf.gg.load;

import org.apache.ignite.configuration.CacheConfiguration;

import static org.apache.ignite.cache.CacheAtomicityMode.TRANSACTIONAL;
import static org.apache.ignite.cache.CacheMode.PARTITIONED;

/**
 * @author NIzhikov
 */
public class DefaultConfigurationProvider<K, V> implements CacheConfigurationProvider<K, V> {
    @Override public CacheConfiguration<K, V> create(String name) {
        return new CacheConfiguration<K, V>()
                .setAtomicityMode(TRANSACTIONAL)
                .setCacheMode(PARTITIONED)
                .setBackups(3)
                .setName(name);
    }
}
