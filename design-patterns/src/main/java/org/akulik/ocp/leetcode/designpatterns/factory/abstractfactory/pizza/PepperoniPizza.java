package org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.pizza;

import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

  public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    veggies = ingredientFactory.createVeggies();
    pepperoni = ingredientFactory.createPepperoni();
  }
}
