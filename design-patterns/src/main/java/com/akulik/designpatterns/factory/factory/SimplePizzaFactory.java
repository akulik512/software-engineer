package com.akulik.designpatterns.factory.factory;

import com.akulik.designpatterns.factory.factory.pizza.CheesePizza;
import com.akulik.designpatterns.factory.factory.pizza.ClamPizza;
import com.akulik.designpatterns.factory.factory.pizza.PepperoniPizza;
import com.akulik.designpatterns.factory.factory.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }

        return pizza;
    }
}
