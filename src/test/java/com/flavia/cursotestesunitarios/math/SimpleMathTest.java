package com.flavia.cursotestesunitarios.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    private static final SimpleMath MATH = new SimpleMath();

    //Nomenclatura de Testes: test[SystemUnderTest]_[ConditionOrStateChange]_[ExpectedResult]

    @Test
    @DisplayName("testSum: 2+3 = 5")
    void testSum_When_TwoIsAddedByThree_ShouldReturnFive() {
        Double actual = MATH.sum(2.0, 3.0);
        double expected = 5.0;

        assertEquals(expected, actual, "testSum() did not produce the expected result.");
        // o parâmetro message só é impresso quando o teste falha

        assertNotEquals(6.2, actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    @DisplayName("testSubtraction: 10-5 = 5")
    void testSubtraction_WhenFiveIsSubtractedFromTen_ShouldReturnFive() {
        Double actual = MATH.subtraction(10.0, 5.0);
        double expected = 5.0;

        assertEquals(expected, actual, "testSubtraction() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    @DisplayName("testMultiplication: 10x5 = 50")
    void testMultiplication_WhenTenIsMultipliedByFive_ShouldReturnFifty() {
        Double actual = MATH.multiplication(10.0, 5.0);
        double expected = 50.0;

        assertEquals(expected, actual, "testMultiplication() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    @DisplayName("testDivision: 10/5 = 2")
    void testDivision_WhenTenIsDividedByFive_ShouldReturnTwo() {
        Double actual = MATH.division(10.0, 5.0);
        double expected = 2.0;

        assertEquals(expected, actual, "testDivision() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    @DisplayName("testMean: (10+5)/2 = 5")
    void testMean_WhenTenIsAddedByFiveAndDividedByTwo_ShouldReturnSevenPointFive() {
        Double actual = MATH.mean(10.0, 5.0);
        double expected = 7.5;

        assertEquals(expected, actual, "testMean() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

    @Test
    @DisplayName("testSquareRoot: square root of 4 = 2")
    void testSquareRoot_WhenCalculateSquareRootOfFour_ShouldReturnTwo() {
        Double actual = MATH.squareRoot(4.0);
        double expected = 2.0;

        assertEquals(expected, actual, "testSquareRoot() did not produce the expected result.");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }

}
