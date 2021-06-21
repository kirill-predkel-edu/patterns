package com.observer;

public class TestObserver {
    public static void main(String[] args) {
        CakeFactory factory = new CakeFactory();

        factory.addSubscriber(new Buyer());

        factory.priceChange(2);

    }
}
