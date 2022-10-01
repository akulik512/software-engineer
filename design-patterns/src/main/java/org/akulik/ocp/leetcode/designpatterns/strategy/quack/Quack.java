package org.akulik.ocp.leetcode.designpatterns.strategy.quack;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
