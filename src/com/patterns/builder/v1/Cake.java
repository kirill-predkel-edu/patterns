package com.patterns.builder.v1;

public class Cake {
    private String layer;
    private String filling;
    private String cream;

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setCream(String cream) {
        this.cream = cream;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "layer='" + layer + '\'' +
                ", filling='" + filling + '\'' +
                ", cream='" + cream + '\'' +
                '}';
    }
}