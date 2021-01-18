package com.akulik.designpatterns.factory.factory.pizza;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Pepperoni pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake Pepperoni pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Pepperoni pizza");
    }

    @Override
    public void box() {
        System.out.println("Box Pepperoni pizza");
    }
}
