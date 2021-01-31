package com.akulik.designpatterns.templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water!");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup!");
    }

}
