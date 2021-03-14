package com.akulik.ocp.inheritance;

public class Food extends Product {
    @Override
    public void getName() {
        System.out.println("Food -> getName()");
    }

    public void getBestBefore() {
        System.out.println("Food -> getBestBefore()");
    }
}
