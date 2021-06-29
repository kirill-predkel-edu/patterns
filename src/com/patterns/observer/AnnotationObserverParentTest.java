package com.patterns.observer;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.*;

@TestInstance(Lifecycle.PER_CLASS)
abstract class AnnotationObserverParentTest {

    @BeforeAll
    void parentBeforeAll() {
        System.out.println("This is Before all of the parent class!");
    }

    @BeforeEach
    void parentBeforeEach() {
        System.out.println("This is Before each of the parent class!");
    }

    @AfterEach
    void parentAfterEach() {
        System.out.println("This is After each of the parent class!");
    }


    @AfterAll
    void parentAfterAll() {
        System.out.println("This is After all of the parent class!");
    }
}