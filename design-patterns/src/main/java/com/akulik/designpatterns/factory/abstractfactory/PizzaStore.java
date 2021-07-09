package com.akulik.designpatterns.factory.abstractfactory;

import com.akulik.designpatterns.factory.abstractfactory.pizza.Pizza;

public abstract class PizzaStore {

  public void orderPizza(String type) {
    Pizza pizza;

    pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  }

  protected abstract Pizza createPizza(String type);
}
