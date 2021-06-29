package com.study.serialization;

import java.io.*;

public class CarSerialization {
    public static void serialize() {
        try {
            Car car =new Car(211,"Kia Rio");
            FileOutputStream fileOutputStream=new FileOutputStream("file.txt");
            ObjectOutputStream out=new ObjectOutputStream(fileOutputStream);
            out.writeObject(car);
            out.flush();
            out.close();
            System.out.println("Car is serialized !");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}