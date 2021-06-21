package com.builder.v2;

public class TestBuilder {
    public static void main(String[] args) {
        Cake honeyCake = new Cake.CakeBuilder("Biscuit layers")
                .makeCream("Sourcream")
                .makeFilling("Honey filling")
                .bake();
        System.out.println(honeyCake);

        Cake anyCake = new Cake.CakeBuilder("Biscuit layers")
                .bake();
        System.out.println(anyCake);
    }
}