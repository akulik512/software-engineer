package com.akulik.ocp.module6.part1;

public class Part1 {
  public static void main(String[] args) {
    Food x1 = new Food();
    x1.toString();
    x1.getName();
    x1.getBestBefore();

    Product x3 = x1;
    x3.toString();
    x3.getName();
    // You can't do that, because the variable x3 does not project Food-specific stuff.
    // x3.getBestBefore();

    // Type casting
    Product x4 = new Food();
    ((Food) x4).getBestBefore();
  }
}
