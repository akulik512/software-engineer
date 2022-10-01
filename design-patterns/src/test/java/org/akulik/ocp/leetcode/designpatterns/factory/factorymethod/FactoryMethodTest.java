package org.akulik.ocp.leetcode.designpatterns.factory.factorymethod;

import org.akulik.ocp.leetcode.designpatterns.factory.factorymethod.style.Pizza;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Factory Method")
class FactoryMethodTest {

  @Test
  void example() {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    System.out.println("--- Order 1 ---");
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    System.out.println("--- Order 2 ---");
    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
  }
}
