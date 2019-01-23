package com.codurance.primefactors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorsShould {

    @ParameterizedTest
    @CsvSource(value={
            "1:1",
            "2:2",
            "3:3",
    }, delimiter=':')
    void factorise_a_number_into_its_primes(int input, String rawOutput) {
        Set<Integer> expectedOutput = Arrays.stream(rawOutput.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        Set<Integer> actualOutput = new PrimeFactors().factorise(input);

        assertEquals(expectedOutput, actualOutput);
    }
}
