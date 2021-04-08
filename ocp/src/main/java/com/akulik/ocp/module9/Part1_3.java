package com.akulik.ocp.module9;

import java.util.HashMap;

public class Part1_3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "World");
        map.put(3, null);
        System.out.println("Original map: " + map);

        map.putIfAbsent(4, "Kulik");
        System.out.println("1 Updated map: " + map);

        map.putIfAbsent(3, "Andrei");
        System.out.println("2 Updated map: " + map);

        map.putIfAbsent(3, "Vasya");
        System.out.println("3 Updated map: " + map);
    }
}
