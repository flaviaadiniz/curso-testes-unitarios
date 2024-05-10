package com.flavia.cursotestesunitarios.tests;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(2)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderByIndexTest {

    @Test
    @Order(0)
    void testC() {
        System.out.println("Running Test C");
    }

    @Test
    @Order(2)
    void testB() {
        System.out.println("Running Test B");
    }

    @Test
    @Order(1)
    void testA() {
        System.out.println("Running Test A");
    }

    @Test
    @Order(3)
    void testD() {
        System.out.println("Running Test D");
    }

}
