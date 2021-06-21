package com.singleton;

public class Singleton {
    private static Singleton instance;
    public String text;

    private Singleton(String text) {
        this.text = text;
    }

    public static Singleton makeInstance(String text) {
        if (instance == null) {
            instance = new Singleton(text);
        }
        return instance;
    }
}