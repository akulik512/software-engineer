package org.akulik.ocp.leetcode.designpatterns.factory.factorymethod.style;

public class ChicagoStyleVeggiePizza extends Pizza {

  public ChicagoStyleVeggiePizza() {
    name = "Chicago Style Veggie Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Barbecue Sauce";
    toppings.add("Shredded Mozzarella Cheese");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
