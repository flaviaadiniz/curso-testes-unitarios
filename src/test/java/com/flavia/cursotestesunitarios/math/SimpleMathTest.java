package com.flavia.cursotestesunitarios.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    private static final SimpleMath MATH = new SimpleMath();

    @Test
    void testSum() {
        Double actual = MATH.sum(2.5, 3.5);
        double expected = 6.0;

        assertEquals(expected, actual, "testSum() did not produce the expected result.");
        // o parâmetro message só é impresso quando o teste falha

        assertNotEquals(6.2, actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    void testSubtraction() {
        Double actual = MATH.subtraction(10.0, 5.0);
        double expected = 5.0;

        assertEquals(expected, actual, "testSubtraction() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    void testMultiplication() {
        Double actual = MATH.multiplication(10.0, 5.0);
        double expected = 50.0;

        assertEquals(expected, actual, "testMultiplication() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    void testDivision() {
        Double actual = MATH.division(10.0, 5.0);
        double expected = 2.0;

        assertEquals(expected, actual, "testDivision() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    void testMean() {
        Double actual = MATH.mean(10.0, 5.0);
        double expected = 7.5;

        assertEquals(expected, actual, "testMean() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    void testSquareRoot() {
        Double actual = MATH.squareRoot(4.0);
        double expected = 2.0;

        assertEquals(expected, actual, "testSquareRoot() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

}
