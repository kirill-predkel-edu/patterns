package com.observer;

public class Buyer implements Subscriber {

    @Override
    public void takeCake() {
        System.out.println("Wow! Price drops! I need to buy the cake");
    }
}
