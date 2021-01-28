package com.akulik.designpatterns.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("I drew - Square!");
    }
}
