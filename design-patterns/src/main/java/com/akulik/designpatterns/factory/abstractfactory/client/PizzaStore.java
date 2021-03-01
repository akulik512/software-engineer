package com.akulik.designpatterns.factory.abstractfactory.client;

import com.akulik.designpatterns.factory.abstractfactory.Pizza;

public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza(String type);

}
