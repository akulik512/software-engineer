package org.akulik.designpatterns.factory.factory;

import org.akulik.designpatterns.factory.factory.pizza.Pizza;

public class PizzaStore {

  private final SimplePizzaFactory factory;

  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public void orderPizza(String type) {
    Pizza pizza;

    pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  }
}
