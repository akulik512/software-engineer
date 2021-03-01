package com.akulik.designpatterns.factory.factorymethod.store;

import com.akulik.designpatterns.factory.factorymethod.style.NYStyleCheesePizza;
import com.akulik.designpatterns.factory.factorymethod.style.NYStyleVeggiePizza;
import com.akulik.designpatterns.factory.factorymethod.style.Pizza;

public class NYPizzaStore extends PizzaStore {

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

