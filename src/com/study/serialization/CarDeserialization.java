package com.study.serialization;

import java.io.*;

public class CarDeserialization {
    public static void deserialize() {
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("file.txt"));
            Car car=(Car)objectInputStream.readObject();
            System.out.println(car.id+" "+car.brand);
            objectInputStream.close();
            System.out.println("Car is deserialized !");
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}