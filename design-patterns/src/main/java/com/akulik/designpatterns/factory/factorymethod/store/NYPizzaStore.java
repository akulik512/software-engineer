package com.akulik.designpatterns.factory.factorymethod.store;

import com.akulik.designpatterns.factory.factorymethod.style.NYStyleCheesePizza;
import com.akulik.designpatterns.factory.factorymethod.style.NYStyleVeggiePizza;
import com.akulik.designpatterns.factory.factorymethod.style.Pizza;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}

