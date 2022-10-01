package org.akulik.designpatterns.facade;

public class ShapeFacade {

  private final Shape circle;
  private final Shape rectangle;
  private final Shape square;

  public ShapeFacade() {
    circle = new Circle();
    rectangle = new Rectangle();
    square = new Square();
  }

  public void draw() {
    System.out.println("Let's start draw lesson!");
    circle.draw();
    rectangle.draw();
    square.draw();
  }
}
