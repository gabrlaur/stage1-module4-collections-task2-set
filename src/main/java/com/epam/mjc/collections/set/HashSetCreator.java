package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> newHashSet = new HashSet<>();
        for (Integer i : sourceList) {
            if (i % 2 != 0) {
                newHashSet.add(i);
                newHashSet.add(2 * i);
            } else {
                int j = i;
                newHashSet.add(j);
                while (j % 2 == 0) {
                    j = j / 2;
                    newHashSet.add(j);
                }
            }
        }
        return newHashSet;
    }
}
