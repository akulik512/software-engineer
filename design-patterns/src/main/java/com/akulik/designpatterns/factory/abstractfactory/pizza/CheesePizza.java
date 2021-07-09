package com.akulik.designpatterns.factory.abstractfactory.pizza;

import com.akulik.designpatterns.factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    veggies = ingredientFactory.createVeggies();
    cheese = ingredientFactory.createCheese();
  }
}
