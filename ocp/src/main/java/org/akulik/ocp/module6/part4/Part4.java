package org.akulik.ocp.module6.part4;

public class Part4 {

  public static void main(String[] args) {
    String a = "Hello";
    String b = "Hello";
    String c = "Hello";
    String d = "heLLo";

    System.out.println("a == b // " + (a == b));
    System.out.println("a == c // " + (a == c));
    System.out.println("a.equals(b) // " + (a.equals(b)));
    System.out.println("a.equals(c) // " + (a.equals(c)));
    System.out.println("a.equals(d) // " + (a.equals(d)));
    System.out.println("a.equalsIgnoreCase(d) // " + (a.equalsIgnoreCase(d)));
  }
}
