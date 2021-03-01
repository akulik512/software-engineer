package com.akulik.designpatterns.factory.abstractfactory;

import com.akulik.designpatterns.factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
        clam = ingredientFactory.createClam();
    }

}
