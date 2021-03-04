package com.akulik.designpatterns.factory.abstractfactory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Abstract Factory")
class AbstractFactoryTest {

    @Test
    void example() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("--- Order 1 ---");
        nyStore.orderPizza("cheese");

        System.out.println("--- Order 2 ---");
        chicagoStore.orderPizza("clam");

        System.out.println("--- Order 3 ---");
        nyStore.orderPizza("pepperoni");

        System.out.println("--- Order 4 ---");
        nyStore.orderPizza("veggie");
    }

}