package com.patterns.builder.v2;

public class Cake
{

    private final String layers; // required, because cake cannot be w/o layers
    private final String filling; // optional
    private final String cream; // optional

    private Cake(CakeBuilder builder) {
        this.layers = builder.layers;
        this.filling = builder.filling;
        this.cream = builder.cream;
    }

    @Override
    public String toString() {
        return "Cake: "+this.layers +", "+this.filling +", "+this.cream;
    }

    public static class CakeBuilder
    {
        private final String layers;
        private String filling = "There is no filling";
        private String cream = "There is no cream";

        public CakeBuilder(String layers) {
            this.layers = layers;
        }

        public CakeBuilder makeFilling(String filling) {
            this.filling = filling;
            return this;
        }
        public CakeBuilder makeCream(String cream) {
            this.cream = cream;
            return this;
        }

        public Cake bake() {
            Cake cake =  new Cake(this);
            return cake;
        }
    }
}