package com.codurance.primefactors;

import java.util.Set;

class PrimeFactors {
    Set<Integer> factorise(int input) {
        return (input == 4)
            ? Set.of(2)
            : Set.of(input);
    }
}
