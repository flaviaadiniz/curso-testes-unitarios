package com.flavia.cursotestesunitarios.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMathTest {

    @Test
    void testSum() {

        SimpleMath math = new SimpleMath();
        Double result = math.sum(2.5, 3.5);
        double expected = 6.0;

        assertEquals(expected, result, "testSum() did not produce the expected result.");
        // o parâmetro message só é impresso quando o teste falha

        System.out.println("Expected: " + expected + " | Result: " + result);
    }

}
