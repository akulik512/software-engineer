package com.akulik.designpatterns.facade;

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("I drew - Circle!");
  }
}
