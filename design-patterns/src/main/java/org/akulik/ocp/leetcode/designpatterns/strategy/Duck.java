package org.akulik.ocp.leetcode.designpatterns.strategy;

import org.akulik.ocp.leetcode.designpatterns.strategy.fly.FlyBehavior;
import org.akulik.ocp.leetcode.designpatterns.strategy.quack.QuackBehavior;

public abstract class Duck {

  private QuackBehavior quackBehavior;
  private FlyBehavior flyBehavior;

  public void performQuack() {
    quackBehavior.quack();
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public abstract void display();
}
