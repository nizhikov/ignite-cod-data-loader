package com.sbt;

/**
 */
public class CompareUtils {
    public static <T extends Comparable<T>> int compare(T first, T second) {
        if (first == null || second == null)
            return first == null && second == null ? 0 : -1;

        return first.compareTo(second);
    }
}
