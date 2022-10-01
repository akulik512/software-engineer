package org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient;

import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.cheese.Cheese;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.clams.Clams;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.dough.Dough;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.sauce.Sauce;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();

  Veggies[] createVeggies();

  Pepperoni createPepperoni();

  Clams createClam();
}
