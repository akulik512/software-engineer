package org.akulik.designpatterns.factory.factory;

import org.akulik.designpatterns.factory.factory.pizza.CheesePizza;
import org.akulik.designpatterns.factory.factory.pizza.ClamPizza;
import org.akulik.designpatterns.factory.factory.pizza.PepperoniPizza;
import org.akulik.designpatterns.factory.factory.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "clam":
                return new ClamPizza();
        }
        return null;
    }
}
