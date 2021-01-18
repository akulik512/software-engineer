package com.akulik.designpatterns.factory.factorymethod.store;

import com.akulik.designpatterns.factory.factorymethod.style.ChicagoStyleCheesePizza;
import com.akulik.designpatterns.factory.factorymethod.style.ChicagoStyleVeggiePizza;
import com.akulik.designpatterns.factory.factorymethod.style.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
