package org.akulik.designpatterns.factory.abstractfactory.ingredient;

import org.akulik.designpatterns.factory.abstractfactory.ingredient.cheese.Cheese;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.cheese.MozzarellaCheese;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.clams.Clams;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.clams.FrozenClams;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.dough.Dough;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.dough.ThickCrustDough;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.sauce.PlumTomatoSauce;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.sauce.Sauce;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.veggies.BlackOlives;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.veggies.Eggplant;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.veggies.Spinach;
import org.akulik.designpatterns.factory.abstractfactory.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
