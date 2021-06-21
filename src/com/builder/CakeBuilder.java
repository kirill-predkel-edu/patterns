package com.builder;

public abstract class CakeBuilder {
    public Cake cake;

    public Cake getCake() {
        return cake;
    }

    public void createNewCake() {
        cake = new Cake();
    }

    abstract void makeLayer();
    abstract void makeFilling();
    abstract void makeCream();

}
