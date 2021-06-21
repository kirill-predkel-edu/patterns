package com.builder;

public class HoneyCakeBuilder extends CakeBuilder{

    @Override
    public void makeLayer() {
        cake.setLayer("Biscuit");
    }

    @Override
    public void makeFilling() {
        cake.setFilling("Honey");
    }

    @Override
    public void makeCream() {
        cake.setCream("Sourcream");
    }
}
