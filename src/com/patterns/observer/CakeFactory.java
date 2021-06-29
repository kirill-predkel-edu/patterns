package com.patterns.observer;
import java.util.ArrayList;

public class CakeFactory implements Observable {
    private int cakePrice = 10;
    ArrayList<Subscriber> subscribers = new ArrayList<>();

    public boolean priceChange(int changeAmount) {
        int oldPrice = cakePrice;
        boolean subscriberIsNotified = true;
        cakePrice += changeAmount;
        if (cakePrice < oldPrice ) {
            notifySubscriber();
            return subscriberIsNotified;
        }
        else {
            subscriberIsNotified = false;
            return subscriberIsNotified;
        }
    }

    @Override
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber s: subscribers) {
            s.takeCake();
        }
    }
}