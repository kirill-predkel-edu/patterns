package com.builder.v1;

public class Cook {
    private CakeBuilder cakeBuilder;

    public void setCakeBuilder(CakeBuilder builder) {
        cakeBuilder = builder;
    }

    public Cake getCake() {
        return cakeBuilder.getCake();
    }

    public void makeCake() {
        cakeBuilder.createNewCake();
        cakeBuilder.makeLayer();
        cakeBuilder.makeFilling();
        cakeBuilder.makeCream();
    }

}
