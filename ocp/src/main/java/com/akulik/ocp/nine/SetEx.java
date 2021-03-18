package com.akulik.ocp.nine;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add(null);
        stringSet.add("123");
        stringSet.add(null);
        stringSet.add("123");
        stringSet.add(null);
        System.out.println(stringSet);
    }
}
