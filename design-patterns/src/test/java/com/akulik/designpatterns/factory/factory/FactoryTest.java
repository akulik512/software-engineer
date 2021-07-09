package com.akulik.designpatterns.factory.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Factory")
class FactoryTest {

  @Test
  void example() {
    PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

    System.out.println("--- Order 1 ---");
    pizzaStore.orderPizza("cheese");

    System.out.println("--- Order 2 ---");
    pizzaStore.orderPizza("pepperoni");

    System.out.println("--- Order 3 ---");
    pizzaStore.orderPizza("clam");
  }
}
