package com.study.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class TestMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Say", "my", "name", "Mr.White", "Mr.White");
        printDistinct(list);
    }

    public static void printDistinct(ArrayList<String> list) {
        Stream<String> stream = list.stream();
        stream.distinct().forEach(System.out::println);
    }
}