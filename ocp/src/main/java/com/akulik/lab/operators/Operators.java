package com.akulik.lab.operators;

public class Operators {
  public static void main(String[] args) {
    int a = 10, b = 5;
    System.out.printf("Original a=%s and b=%s%n", a, b);

    a = +b;
    System.out.printf("Result of a =+ b: a=%s and b=%s%n", a, b);

    a = +b + 10;
    System.out.printf("Result of a =+ b + 10: a=%s and b=%s%n", a, b);

    a = b + 10;
    System.out.printf("Result of a = b + 10: a=%s and b=%s%n", a, b);
  }
}
