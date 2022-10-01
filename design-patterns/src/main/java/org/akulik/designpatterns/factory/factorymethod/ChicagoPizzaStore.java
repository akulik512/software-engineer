package org.akulik.designpatterns.factory.factorymethod;

import org.akulik.designpatterns.factory.factorymethod.style.ChicagoStyleCheesePizza;
import org.akulik.designpatterns.factory.factorymethod.style.ChicagoStyleVeggiePizza;
import org.akulik.designpatterns.factory.factorymethod.style.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                return null;
        }
    }
}
