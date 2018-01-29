package ru.sbrf.gg.load;

import org.apache.ignite.configuration.CacheConfiguration;

/**
 * @author NIzhikov
 */
public interface CacheConfigurationProvider<K, V> {
    CacheConfiguration<K, V> create(String name);
}
