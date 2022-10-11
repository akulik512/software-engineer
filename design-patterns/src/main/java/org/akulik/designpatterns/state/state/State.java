package org.akulik.designpatterns.state.state;

public interface State {

  void insertQuarter();

  void ejectQuarter();

  void turnCrank();

  void dispense();
}
