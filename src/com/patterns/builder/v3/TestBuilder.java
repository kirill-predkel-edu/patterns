package com.patterns.builder.v3;

public class TestBuilder {
    public static void main(String[] args) {
        CakeBuilder honeyCakeBuilder = new CakeBuilder();
        honeyCakeBuilder.createNewCake();
        
        honeyCakeBuilder.makeLayer("Biscuit");
        honeyCakeBuilder.makeFilling("Honey");
        honeyCakeBuilder.makeCream("Sourcream");

        System.out.println(honeyCakeBuilder.getCake().toString());
    }
}