package com.akulik.designpatterns.factory.abstractfactory.region;

import com.akulik.designpatterns.factory.abstractfactory.ingredient.cheese.Cheese;
import com.akulik.designpatterns.factory.abstractfactory.ingredient.clams.Clams;
import com.akulik.designpatterns.factory.abstractfactory.ingredient.dough.Dough;
import com.akulik.designpatterns.factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import com.akulik.designpatterns.factory.abstractfactory.ingredient.sauce.Sauce;
import com.akulik.designpatterns.factory.abstractfactory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
