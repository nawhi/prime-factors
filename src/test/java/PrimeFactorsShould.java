import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class PrimeFactorsShould {

    @ParameterizedTest
    @CsvSource({
            "1:1"
    })
    void factorise_a_number_into_its_primes(int input, String rawOutput) {
        int[] outputs = Arrays.stream(rawOutput.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();




    }
}
