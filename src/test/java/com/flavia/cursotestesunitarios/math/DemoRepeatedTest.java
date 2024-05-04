package com.flavia.cursotestesunitarios.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class DemoRepeatedTest {

    SimpleMath math;

    @BeforeEach
    void beforeEach() {
        math = new SimpleMath();
    }


    @RepeatedTest(3)
    @DisplayName("Test Division by Zero")
    void testDivision_WhenFirstNumberIsDividedByZero_ShouldThrowArithmeticException(RepetitionInfo repetitionInfo, TestInfo testInfo) {
        // given
        double firstNumber = 10.0;
        double secondNumber = 0.0;

        System.out.println("Repetition number: " + repetitionInfo.getCurrentRepetition() + " of "
        + repetitionInfo.getTotalRepetitions());
        System.out.println("Running " + testInfo.getTestMethod().get().getName());

        // when & then
        assertThrows(ArithmeticException.class, () -> math.division(firstNumber, secondNumber));
    }


}
