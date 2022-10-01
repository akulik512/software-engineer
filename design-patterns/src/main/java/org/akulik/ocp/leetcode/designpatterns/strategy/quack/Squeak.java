package org.akulik.ocp.leetcode.designpatterns.strategy.quack;

public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
