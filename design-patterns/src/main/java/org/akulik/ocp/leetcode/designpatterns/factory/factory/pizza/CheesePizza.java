package org.akulik.ocp.leetcode.designpatterns.factory.factory.pizza;

public class CheesePizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("Prepare Cheese pizza");
  }

  @Override
  public void bake() {
    System.out.println("Bake Cheese pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cut Cheese pizza");
  }

  @Override
  public void box() {
    System.out.println("Box Cheese pizza");
  }
}
