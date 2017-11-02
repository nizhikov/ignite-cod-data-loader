package com.sbt.dpl.gridgain;

public class AffinityParticleKey implements Comparable<AffinityParticleKey> {
    // Имена полей
    public static final String ROOT_ID_FIELD_NAME = "rootId";
    public static final String ID_FIELD_NAME = "id";
    public static final String PARTITION_ID_FIELD_NAME = "partitionId";

    /*
    Идентификатор родственного ОУ
     */
    private long id;
    /*
    Идентификатор сегмента ОУ
     */
    private long partitionId;
    /*
    Идентификатор корневого ОУ иерархии РОУ
     */
    private long rootId;

    /**
     * Получить идентификатор родственного ОУ
     * @return идентификатор родственного ОУ
     */
    public long getId() {
        return id;
    }

    /**
     * Получить идентификатор сегмента родственного ОУ
     * @return идентификатор сегмента родственного ОУ
     */
    public long getPartitionId() {
        return partitionId;
    }

    /**
     * Получить идентификатор корневого ОУ иерархии РОУ
     * @return идентификатор корневого ОУ иерархии РОУ
     */
    public long getRootId() {
        return rootId;
    }

    public AffinityParticleKey(long id, long partitionId, long rootId) {
        this.id = id;
        this.partitionId = partitionId;
        this.rootId = rootId;
    }

    @Override
    public int hashCode() {
        return HashFaq6Strategy.hash((int) getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AffinityParticleKey that = (AffinityParticleKey) o;
        return (id == that.id) && (partitionId == that.partitionId);
    }

    @Override
    public int compareTo(AffinityParticleKey o) {
        if (this.id == o.id) {
            return 0;
        }
        if (o.id > this.id) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("AffinityParticleKey{id=%d, partitionId=%d, rootId=%d}",
            id, partitionId, rootId);
    }
}
