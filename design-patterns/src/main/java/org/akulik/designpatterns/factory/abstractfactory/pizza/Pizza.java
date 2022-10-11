package org.akulik.designpatterns.factory.abstractfactory.pizza;

import org.akulik.designpatterns.factory.abstractfactory.ingredient.cheese.Cheese;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.clams.Clams;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.dough.Dough;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.sauce.Sauce;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.veggies.Veggies;

import java.util.Arrays;

public abstract class Pizza {

  public String name;
  public Dough dough;
  public Sauce sauce;
  public Veggies[] veggies;
  public Cheese cheese;
  public Pepperoni pepperoni;
  public Clams clam;

  public abstract void prepare();

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Pizza{"
        + "name='"
        + name
        + '\''
        + ", dough="
        + dough
        + ", sauce="
        + sauce
        + ", veggies="
        + Arrays.toString(veggies)
        + ", cheese="
        + cheese
        + ", pepperoni="
        + pepperoni
        + ", clam="
        + clam
        + '}';
  }
}
