package ru.sbrf.gg.load.builder;

import com.sbt.DelimetedStringParser;
import com.sbt.dpl.gridgain.AffinityParticleKey;
import ru.sbrf.gg.load.TableInfo;

/**
 */
public class AffinityParticleKeyBuilder extends ReflectionBuilder implements ObjectBuilder {
    @Override public Object build(String line, TableInfo tableInfo) {
        if (tableInfo.key != AffinityParticleKey.class)
            throw new RuntimeException("Not AffinityParticle Key!!!");

        int[] indexes = new int[]{0, 0, line.length()};

        Long id = DelimetedStringParser._long(tableInfo.id._2(), line, indexes);
        Long partitionId = DelimetedStringParser._long(tableInfo.partitionId._2(), line, indexes);
        Long rootId = DelimetedStringParser._long(tableInfo.rootId._2(), line, indexes);

        return new AffinityParticleKey(id, partitionId, rootId);
    }
}
