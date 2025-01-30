package pro.sky.calculatorWithTesting.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculatorWithTesting.constants.CalcServiceImplTestConstants.*;

class CalcServiceImplTest {

    CalcService out = new CalcServiceImpl();

    @Test
    void shouldReturnRightStringWhen5Plus5() {
        assertEquals(PLUS_STRING, out.plus(5, 5));
        assertEquals(PLUS_STRING2, out.plus(345, 424));
    }

    @Test
    void shouldReturnRightStringWhen5Minus5() {
        assertEquals(MINUS_STRING, out.minus(5, 5));
        assertEquals(MINUS_STRING2, out.minus(345, 424));
    }

    @Test
    void shouldReturnRightStringWhen5Multiply5() {
        assertEquals(MULTIPLY_STRING, out.multiply(5, 5));
        assertEquals(MULTIPLY_STRING2, out.multiply(345, 424));
    }

    @Test
    void shouldReturnRightStringWhen5Divide5() {
        assertEquals(DIVIDE_STRING, out.divide(5, 5));
        assertEquals(DIVIDE_STRING2, out.divide(345, 424));
    }

    @Test
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        assertThrows(IllegalArgumentException.class,
                ()->{out.divide(5,0);});
    }
}