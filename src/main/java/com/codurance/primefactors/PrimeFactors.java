package com.codurance.primefactors;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.emptySet;

class PrimeFactors {
    Set<Integer> factorise(int input) {
        if (input == 1)
            return emptySet();
        if (input % 2 == 0)
            return union(Set.of(2), factorise(input / 2));
        return Set.of(input);
    }

    private Set<Integer> union(Set<Integer> s1, Set<Integer> s2) {
        return Stream.concat(s1.stream(), s2.stream())
                .collect(Collectors.toSet());
    }
}
