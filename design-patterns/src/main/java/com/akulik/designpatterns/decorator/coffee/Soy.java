package com.akulik.designpatterns.decorator.coffee;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.36;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
