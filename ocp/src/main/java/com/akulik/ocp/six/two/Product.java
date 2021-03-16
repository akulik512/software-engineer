package com.akulik.ocp.six.two;

public class Product {

    private final String msg;

    public Product(final String msg) {
        this.msg = msg;
    }

    public void getName() {
        System.out.println("Product -> " + msg);
    }
}
