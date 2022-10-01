package org.akulik.ocp.module12;

public class Part1 {

  public static void main(String[] args) {
    try {
      System.out.println("Hello, World!");
      throw new RuntimeException();
    } catch (RuntimeException e) {
      System.out.println("You'll see this message from the catch block!");
    } finally {
      System.out.println("You'll see this message from the finally block after return!!");
    }
  }
}
