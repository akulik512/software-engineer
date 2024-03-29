package org.akulik.designpatterns.adapter;

import org.akulik.designpatterns.adapter.duck.Duck;
import org.akulik.designpatterns.adapter.turkey.Turkey;

public class TurkeyAdapter implements Duck {

  private final Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }
}
