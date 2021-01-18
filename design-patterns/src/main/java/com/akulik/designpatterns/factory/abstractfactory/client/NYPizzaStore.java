package com.akulik.designpatterns.factory.abstractfactory.client;

import com.akulik.designpatterns.factory.abstractfactory.*;
import com.akulik.designpatterns.factory.abstractfactory.region.NYPizzaIngredientFactory;
import com.akulik.designpatterns.factory.abstractfactory.region.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
