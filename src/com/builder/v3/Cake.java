package com.builder.v3;

public class Cake {
    private String layer = "With no layers";
    private String filling = "With no filling";
    private String cream = "With no cream";

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
