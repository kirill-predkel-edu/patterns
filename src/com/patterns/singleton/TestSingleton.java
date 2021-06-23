package com.patterns.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.makeInstance("test");
        Singleton anotherSingleton = Singleton.makeInstance("another test");

        System.out.println(singleton.text);
        System.out.println(anotherSingleton.text);
    }

}
