package com.akulik.ocp.inheritance;

public class Drink extends Product {
    @Override
    public void getName() {
        System.out.println("Drink -> getName()");
    }
}
