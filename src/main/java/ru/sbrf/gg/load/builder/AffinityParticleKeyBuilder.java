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

        Long id = DelimetedStringParser._long(tableInfo.id.idx, line, indexes);
        Long partitionId = DelimetedStringParser._long(tableInfo.partitionId.idx, line, indexes);
        Long rootId = DelimetedStringParser._long(tableInfo.rootId.idx, line, indexes);

        return new AffinityParticleKey(id, partitionId, rootId);
    }

    @Override public int compare(Object first, Object second) {
        AffinityParticleKey f = (AffinityParticleKey)first;
        AffinityParticleKey s = (AffinityParticleKey)second;

        if (f.getId() != s.getId())
            return f.getId() > s.getId() ? 1 : -1;

        if (f.getPartitionId() != s.getPartitionId())
            return f.getPartitionId() > s.getPartitionId() ? 1 : -1;

        if (f.getRootId() != s.getRootId())
            return f.getRootId() > s.getRootId() ? 1 : -1;

        return 0;
    }
}
