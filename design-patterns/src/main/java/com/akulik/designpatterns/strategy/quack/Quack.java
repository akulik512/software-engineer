package com.akulik.designpatterns.strategy.quack;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
