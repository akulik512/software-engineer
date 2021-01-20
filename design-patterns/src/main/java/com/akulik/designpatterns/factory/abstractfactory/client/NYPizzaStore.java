package com.akulik.designpatterns.factory.abstractfactory.client;

import com.akulik.designpatterns.factory.abstractfactory.*;
import com.akulik.designpatterns.factory.abstractfactory.ingredient.NYPizzaIngredientFactory;
import com.akulik.designpatterns.factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
