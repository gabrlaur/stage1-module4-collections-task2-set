package com.epam.mjc.collections.set;

import java.util.Set;
import java.util.stream.Collectors;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> newSet = firstSet.stream()
                .filter(secondSet::contains)
                .filter(s -> !thirdSet.contains(s))
                .collect(Collectors.toSet());
        Set<String> anotherSet = thirdSet.stream()
                .filter(s -> !firstSet.contains(s))
                .filter(s -> !secondSet.contains(s))
                .collect(Collectors.toSet());
        newSet.addAll(anotherSet);
        return newSet;
    }
}
