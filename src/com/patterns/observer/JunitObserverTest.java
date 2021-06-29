package com.patterns.observer;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class JunitObserverTest {

    @Test
    void isSubscriberNotifiedWhenPriceDrops() {
        CakeFactory factory = new CakeFactory();
        factory.addSubscriber(new Buyer());
        assertTrue(factory.priceChange(-2), "The subscriber isn't notified when price drops!");
    }

    @Test
    void isSubscriberNotifiedWhenPriceRises() {
        CakeFactory factory = new CakeFactory();
        factory.addSubscriber(new Buyer());
        assertAll(

                () -> assertFalse(factory.priceChange(2), "The subscriber is notified when price rises!"),
                () -> assertEquals("true", String.valueOf(factory.priceChange(-2)), "The subscriber isn't notified when price drops!")
        );
    }

    @Disabled
    @Test
    void isSubscriberAddedToList() {
        CakeFactory factory = new CakeFactory();
        Buyer buyer = new Buyer();
        factory.addSubscriber(buyer);
    }
}