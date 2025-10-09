package ejercicio2;

import org.ejercicio2.IdCalculation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdCalculationTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "32922764, N",
            "60830197, G",
            "34730604, Y",
            "55421880, E",
            "44648008, V",
            "98436448, J"
    })
    void testCalculateLetter(int numberId, char expectedLetter) {
        assertEquals(expectedLetter, IdCalculation.calculateLetter(numberId),
                "The calculated letter should match the expected one");
    }
}