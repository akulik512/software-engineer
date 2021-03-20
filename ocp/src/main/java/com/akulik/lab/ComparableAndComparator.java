package com.akulik.lab;

import java.util.ArrayList;

public class ComparableAndComparator {
    public static void main(String[] args) {
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html
        System.out.println("-- Comparator Example");

        ArrayList<Message> arrayList = new ArrayList<>();
        arrayList.add(new Message(3, "Dima"));
        arrayList.add(new Message(1, "Andrei"));
        arrayList.add(new Message(4, "Lesha"));
        arrayList.add(new Message(2, "Vasya"));
        System.out.println("Original arrayList: " + arrayList);

        arrayList.sort((s1, s2) -> s1.getMsg().compareTo(s2.getMsg()));
        System.out.println("comparator1: " + arrayList);

        arrayList.sort((s1, s2) -> s2.getMsg().compareTo(s1.getMsg()));
        System.out.println("comparator2: " + arrayList);

        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html
        System.out.println("-- Comparable Example");

    }
}
