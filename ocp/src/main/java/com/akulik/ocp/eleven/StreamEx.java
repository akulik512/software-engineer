package com.akulik.ocp.eleven;

import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        int sum = Stream.of("ONE", "TWO", "THREE", "FOUR")
                .mapToInt(String::length)
                .peek(System.out::println)
                .filter(i -> i > 3)
                .sum();

        System.out.println("Sum=" + sum);
    }
}
