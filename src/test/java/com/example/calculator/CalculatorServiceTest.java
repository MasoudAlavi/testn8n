package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void testSquare_positiveNumber() {
        double input = 5;
        double expected = 25;
        assertEquals(expected, service.square(input), 1e-9);
    }

    @Test
    void testSquare_negativeNumber() {
        double input = -3;
        double expected = 9;
        assertEquals(expected, service.square(input), 1e-9);
    }

    @Test
    void testSquare_zero() {
        double input = 0;
        double expected = 0;
        assertEquals(expected, service.square(input), 1e-9);
    }
}
