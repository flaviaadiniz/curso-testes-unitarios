package com.flavia.cursotestesunitarios.tests;

import org.junit.jupiter.api.*;

//@Order(2)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
// vai criar uma instância única para a classe e vai executar todos os métodos, podendo usar no método 2 algo que foi
// usado no método 1, por exemplo - muito utilizado em testes de integração
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderByIndexTest {

    StringBuilder actualValue = new StringBuilder();

    @AfterEach
    void afterEach() {
        System.out.println("The actual value is: " + actualValue);
    }

    @Test
    @Order(1)
    void testC() {
        System.out.println("Running Test C");
        actualValue.append("1");
    }

    @Test
    @Order(3)
    void testB() {
        System.out.println("Running Test B");
        actualValue.append("3");
    }

    @Test
    @Order(2)
    void testA() {
        System.out.println("Running Test A");
        actualValue.append("2");
    }

    @Test
    @Order(4)
    void testD() {
        System.out.println("Running Test D");
        actualValue.append("4");
    }

}
