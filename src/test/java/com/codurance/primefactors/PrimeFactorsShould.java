package com.codurance.primefactors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorsShould {

    @ParameterizedTest
    @MethodSource("test_cases")
    void factorise_a_number_into_its_primes(int input, Set<Integer> expectedOutput) {
        Set<Integer> actualOutput = new PrimeFactors().factorise(input);

        assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> test_cases() {
        return Stream.of(
                Arguments.of(1, Set.of(1)),
                Arguments.of(2, Set.of(2)),
                Arguments.of(3, Set.of(3))
        );
    }
}
