package org.akulik.ocp.leetcode.designpatterns.factory.factorymethod;

import org.akulik.ocp.leetcode.designpatterns.factory.factorymethod.style.Pizza;

public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza;

    pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  protected abstract Pizza createPizza(String type);
}
