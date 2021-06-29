package com.study.serialization;

import java.io.Serializable;

public class Car implements Serializable {
    int id;
    String brand;
    public Car (int id, String brand) {
        this.id = id;
        this.brand = brand;
    }
}

