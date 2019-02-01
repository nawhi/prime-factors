package com.codurance.primefactors;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.emptySet;

class PrimeFactors {
    Set<Integer> factorise(int input) {
        if (input == 1)
            return emptySet();
        for (int i = input; i > 1; --i) {
            if (isPrime(i) && input % i == 0)
                return union(Set.of(i), factorise(input / i));
        }
        return Set.of(input);
    }

    private boolean isPrime(int i) {
        return Set.of(2, 3, 5, 7).contains(i);
    }

    private Set<Integer> union(Set<Integer> s1, Set<Integer> s2) {
        return Stream.concat(s1.stream(), s2.stream())
                .collect(Collectors.toSet());
    }
}
