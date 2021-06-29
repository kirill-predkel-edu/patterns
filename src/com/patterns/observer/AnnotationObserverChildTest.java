package com.patterns.observer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnnotationObserverChildTest extends AnnotationObserverParentTest {

    @BeforeAll
    void childBeforeAll() {
        System.out.println("This is Before all of the child class!");
    }

    @BeforeEach
    void childBeforeEach() {
        System.out.println("This is Before each of the child class!");
    }

    @Test
    void isSubscriberNotifiedWhenPriceDrops() {
        CakeFactory factory = new CakeFactory();
        factory.addSubscriber(new Buyer());
        assertEquals("true", String.valueOf(factory.priceChange(-2)), "Всё очень плохо");
    }

    @AfterEach
    void childAfterEach() {
        System.out.println("This is After each of the child class!");
    }


    @AfterAll
    void childAfterAll() {
        System.out.println("This is After all of the child class!");
    }
}