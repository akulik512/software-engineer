package org.akulik.ocp.leetcode.designpatterns.factory.factory.pizza;

public class ClamPizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("Prepare Clam pizza");
  }

  @Override
  public void bake() {
    System.out.println("Bake Clam pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cut Clam pizza");
  }

  @Override
  public void box() {
    System.out.println("Box Clam pizza");
  }
}
