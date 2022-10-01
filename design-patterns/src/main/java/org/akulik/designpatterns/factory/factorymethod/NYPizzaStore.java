package org.akulik.designpatterns.factory.factorymethod;

import org.akulik.designpatterns.factory.factorymethod.style.NYStyleCheesePizza;
import org.akulik.designpatterns.factory.factorymethod.style.NYStyleVeggiePizza;
import org.akulik.designpatterns.factory.factorymethod.style.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                return null;
        }
    }
}
