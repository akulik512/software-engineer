package com.akulik.designpatterns.facade;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("I drew - Rectangle!");
    }

}
