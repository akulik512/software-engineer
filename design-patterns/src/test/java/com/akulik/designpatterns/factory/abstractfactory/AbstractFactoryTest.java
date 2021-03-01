package com.akulik.designpatterns.factory.abstractfactory;

import com.akulik.designpatterns.factory.abstractfactory.client.ChicagoPizzaStore;
import com.akulik.designpatterns.factory.abstractfactory.client.NYPizzaStore;
import com.akulik.designpatterns.factory.abstractfactory.client.PizzaStore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Abstract Factory")
class AbstractFactoryTest {

    @Test
    void example() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("--- Order 1 ---");
        Pizza pizza = nyStore.orderPizza("cheese");

        System.out.println("--- Order 2 ---");
        pizza = chicagoStore.orderPizza("clam");

        System.out.println("--- Order 3 ---");
        pizza = nyStore.orderPizza("pepperoni");

        System.out.println("--- Order 4 ---");
        pizza = nyStore.orderPizza("veggie");
    }

}