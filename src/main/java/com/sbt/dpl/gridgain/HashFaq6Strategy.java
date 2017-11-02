package com.sbt.dpl.gridgain;

public class HashFaq6Strategy {
    /**
     * Алгоритм хэширования FAQ6
     * @param params параметры хэширования
     * @return хэш от входных параметров
     */
    public static int hash(int... params){
        int hash = 0;

        for(int param: params){
            hash += param;
            hash += (hash << 10);
            hash += (hash >> 6);
        }

        hash += (hash << 3);
        hash ^= (hash >> 11);
        hash += (hash << 15);

        return hash;
    }
}
