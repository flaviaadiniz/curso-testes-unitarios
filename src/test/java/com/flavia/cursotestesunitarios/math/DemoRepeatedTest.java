package com.flavia.cursotestesunitarios.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class DemoRepeatedTest {

    SimpleMath math;

    @BeforeEach
    void beforeEach() {
        math = new SimpleMath();
    }


    @RepeatedTest(3)
    @DisplayName("Test Division by Zero")
    void testDivision_WhenFirstNumberIsDividedByZero_ShouldThrowArithmeticException(RepetitionInfo repetitionInfo) {
        // given
        double firstNumber = 10.0;
        double secondNumber = 0.0;

        System.out.println("Repetition number: " + repetitionInfo.getCurrentRepetition());

        // when & then
        assertThrows(ArithmeticException.class, () -> math.division(firstNumber, secondNumber));
    }


}
