package com.study.lambda;

import java.util.stream.Stream;

public class AnotherTestMethod {

    public static void main(String[] args) {
        String answerYes = "Yes";
        String answerNo = "No";
        Stream<Integer> stream = Stream.of(7, 2, 7, 1, -5);

        String answerNegativeEvenNumbers = hasNegativeEvenNumbers(stream) ? answerYes : answerNo;
        System.out.println("Has stream negative even numbers? " + answerNegativeEvenNumbers);
    }

    public static boolean hasNegativeEvenNumbers(Stream<Integer> stream) {
        return stream.anyMatch(x -> x % 2 == 0 && x < 0);
    }
}