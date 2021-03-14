package com.akulik.ocp.inheritance.four;

public class StringEx {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        String d = "heLLo";

        System.out.println("a == b // " + (a == b));
        System.out.println("a == c // " + (a == c));
        System.out.println("a.equals(b) // " + (a.equals(b)));
        System.out.println("a.equals(c) // " + (a.equals(c)));
        System.out.println("a.equals(d) // " + (a.equals(d)));
        System.out.println("a.equals(d) // " + (a.equalsIgnoreCase(d)));
    }
}
