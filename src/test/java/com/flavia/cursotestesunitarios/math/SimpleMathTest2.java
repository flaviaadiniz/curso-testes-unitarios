package com.flavia.cursotestesunitarios.math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest2 {

    SimpleMath math;

    @BeforeEach
    void beforeEach() {
        math = new SimpleMath();
    }


    @DisplayName("Test - Division")
    @ParameterizedTest
//    @MethodSource("testDivisionInputParameter")
    @CsvSource({
            "10.0, 2.0, 5.0",
            "8.0, 2.0, 4.0",
            "7.5, 3.0, 2.5",
            "9.0, 3.0, 3.0"
    })
    void testDivision_WhenTenIsDividedByFive_ShouldReturnTwo(double firstNumber, double secondNumber, double expected) {

        // when
        Double actual = math.division(firstNumber, secondNumber);

        // then
        assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + "did not produce " + expected +"!");
        assertNotNull(actual);

        System.out.println("Expected: " + expected + " | Actual: " + actual);
    }


//    public static Stream<Arguments> testDivisionInputParameter() {
//        return Stream.of(
//          Arguments.of(10.0, 2.0, 5.0),
//          Arguments.of(8.0, 2.0, 4.0),
//          Arguments.of(7.5, 3.0, 2.5),
//          Arguments.of(9.0, 3.0, 3.0)
//        );
//    }


}
