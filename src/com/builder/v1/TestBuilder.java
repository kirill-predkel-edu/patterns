package com.builder.v1;

public class TestBuilder {
    public static void main(String[] args) {
    Cook cook = new Cook();
    CakeBuilder honeyCakeBuilder = new HoneyCakeBuilder();
    cook.setCakeBuilder(honeyCakeBuilder);
    cook.makeCake();

    Cake cake = cook.getCake();

    System.out.println(cake.toString());
    }
}