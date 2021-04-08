package com.akulik.ocp.module6.part2;

public class Food extends Product {

    private final String msg;

    // You must create parametrized constructor
    public Food(String msg) {
        super(msg);
        this.msg = msg;
    }

    @Override
    public void getName() {
        System.out.println("Food -> " + msg);
    }

    public void getBestBefore() {
        System.out.println("Food -> getBestBefore()");
    }
}
