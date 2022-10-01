package org.akulik.designpatterns.strategy;

import org.akulik.designpatterns.strategy.fly.FlyBehavior;
import org.akulik.designpatterns.strategy.quack.QuackBehavior;

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
