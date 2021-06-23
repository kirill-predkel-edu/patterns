package com.patterns.builder.v3;

public class CakeBuilder {
    public Cake cake;

    public void createNewCake() {
        cake = new Cake();
    }

    public Cake getCake() {
        return cake;
    }

    public void makeLayer(String buidlderLayer) {
        cake.setLayer(buidlderLayer);
    }

    public void makeFilling(String builderFilling) {
        cake.setFilling(builderFilling);
    }
    public void makeCream(String builderCream) {
        cake.setCream(builderCream);
    }
}
