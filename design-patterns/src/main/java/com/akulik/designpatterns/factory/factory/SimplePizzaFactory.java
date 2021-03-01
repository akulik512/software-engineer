package com.akulik.designpatterns.factory.factory;

import com.akulik.designpatterns.factory.factory.pizza.CheesePizza;
import com.akulik.designpatterns.factory.factory.pizza.ClamPizza;
import com.akulik.designpatterns.factory.factory.pizza.PepperoniPizza;
import com.akulik.designpatterns.factory.factory.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
        }

        return pizza;
    }

}
