package pro.sky.calculatorWithTesting.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceImplParamTest {

    private final CalcService out = new CalcServiceImpl();

    @ParameterizedTest
    @CsvSource(value = {"5, 5, 5 + 5 = 10"})
    void plus(int a, int b, String expect) {
        assertEquals(expect, out.plus(a, b));
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 5, 5 - 5 = 0"})
    void minus(int a, int b, String expect) {
        assertEquals(expect, out.minus(a, b));
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 5, 5 * 5 = 25"})
    void multiply(int a, int b, String expect) {
        assertEquals(expect, out.multiply(a, b));
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 5, 5 / 5 = 1.0"})
    void divide(int a, int b, String expect) {
        assertEquals(expect, out.divide(a, b));
    }
}