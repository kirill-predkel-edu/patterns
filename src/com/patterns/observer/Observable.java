package com.patterns.observer;

public interface Observable {
    void addSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void notifySubscriber();
}
