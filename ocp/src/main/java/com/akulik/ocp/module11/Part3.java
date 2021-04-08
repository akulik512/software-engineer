package com.akulik.ocp.module11;

import com.akulik.lab.compare.Message;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part3 {

    public static void main(String[] args) {
        int sum = Stream.of("ONE", "TWO", "THREE", "FOUR")
                .mapToInt(String::length)
                .peek(System.out::println)
                .filter(i -> i > 3)
                .sum();

        System.out.println("Sum=" + sum);

        parallelStreamTest();
        sequentialStreamTest();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public static void parallelStreamTest() {
        List<Message> names = new ArrayList<>();
        names.add(new Message(1, "Brest"));
        names.add(new Message(1, "Minsk"));
        names.add(new Message(1, "Grodno"));

        names.stream()
                .parallel()
                .map(Message::getId)
                .collect(Collectors.toList());
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public static void sequentialStreamTest() {
        List<Message> names = new ArrayList<>();
        names.add(new Message(1, "Brest"));
        names.add(new Message(1, "Minsk"));
        names.add(new Message(1, "Grodno"));

        names.stream()
                .map(Message::getId)
                .collect(Collectors.toList());
    }
}
