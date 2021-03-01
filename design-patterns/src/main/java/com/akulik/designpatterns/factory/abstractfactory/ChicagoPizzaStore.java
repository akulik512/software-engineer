package com.akulik.designpatterns.factory.abstractfactory;

import com.akulik.designpatterns.factory.abstractfactory.ingredient.ChicagoPizzaIngredientFactory;
import com.akulik.designpatterns.factory.abstractfactory.ingredient.PizzaIngredientFactory;
import com.akulik.designpatterns.factory.abstractfactory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }

}
