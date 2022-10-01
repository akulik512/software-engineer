package org.akulik.ocp.leetcode.designpatterns.strategy;

import org.akulik.ocp.leetcode.designpatterns.strategy.fly.FlyNoWay;
import org.akulik.ocp.leetcode.designpatterns.strategy.fly.FlyWithWings;
import org.akulik.ocp.leetcode.designpatterns.strategy.quack.Quack;
import org.akulik.ocp.leetcode.designpatterns.strategy.quack.Squeak;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Strategy")
class StrategyTest {

  @Test
  void example() {
    Duck mallard = new MallardDuck();
    mallard.setFlyBehavior(new FlyWithWings());
    mallard.setQuackBehavior(new Squeak());

    mallard.display();

    mallard.performFly();
    mallard.performQuack();

    System.out.println("------------");

    mallard.setFlyBehavior(new FlyNoWay());
    mallard.setQuackBehavior(new Quack());

    mallard.performFly();
    mallard.performQuack();
  }
}
