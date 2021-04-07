package com.akulik.ocp.module6.part1;

public class Food extends Product {
    @Override
    public void getName() {
        System.out.println("Food -> getName()");
    }

    public void getBestBefore() {
        System.out.println("Food -> getBestBefore()");
    }
}
