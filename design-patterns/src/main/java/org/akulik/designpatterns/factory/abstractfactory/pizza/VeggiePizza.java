package org.akulik.designpatterns.factory.abstractfactory.pizza;

import org.akulik.designpatterns.factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

  public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
  }
}
