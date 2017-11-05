package ru.sbrf.gg.load.builder

import com.sbt.dpl.gridgain.AffinityParticleKey
import ru.sbrf.gg.load.TableInfo

/**
  */
class AffinityParticleKeyBuilder extends ReflectionBuilder {
    override def build(line: Array[String], tableInfo: TableInfo): Any = {
        if (tableInfo.key != classOf[AffinityParticleKey])
            throw new RuntimeException("Not AffinityParticle Key!!!")

        val id = fieldValue(line, tableInfo.id).asInstanceOf[Long]
        val partitionId = fieldValue(line, tableInfo.partitionId).asInstanceOf[Long]
        val rootId = fieldValue(line, tableInfo.rootId).asInstanceOf[Long]

        new AffinityParticleKey(id, partitionId, rootId)
    }
}
