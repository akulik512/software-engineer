package org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient;

import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.cheese.Cheese;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.cheese.ReggianoCheese;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.clams.Clams;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.clams.FreshClams;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.dough.Dough;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.dough.ThinCrustDough;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.sauce.MarinaraSauce;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.sauce.Sauce;
import org.akulik.ocp.leetcode.designpatterns.factory.abstractfactory.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FreshClams();
  }
}
