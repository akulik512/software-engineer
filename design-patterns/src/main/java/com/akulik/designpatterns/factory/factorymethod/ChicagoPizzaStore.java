package com.akulik.designpatterns.factory.factorymethod;

import com.akulik.designpatterns.factory.factorymethod.style.ChicagoStyleCheesePizza;
import com.akulik.designpatterns.factory.factorymethod.style.ChicagoStyleVeggiePizza;
import com.akulik.designpatterns.factory.factorymethod.style.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  public Pizza createPizza(String item) {
    switch (item) {
      case "cheese":
        return new ChicagoStyleCheesePizza();
      case "veggie":
        return new ChicagoStyleVeggiePizza();
      default:
        return null;
    }
  }
}
