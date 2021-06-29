package com.patterns.observer;

public class Buyer implements Subscriber {

    @Override
    public boolean takeCake() {
        System.out.println("Wow! Price drops! I need to buy the cake");
        return true;
    }
}