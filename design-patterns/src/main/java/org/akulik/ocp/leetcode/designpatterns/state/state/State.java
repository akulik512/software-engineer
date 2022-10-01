package org.akulik.ocp.leetcode.designpatterns.state.state;

public interface State {

  void insertQuarter();

  void ejectQuarter();

  void turnCrank();

  void dispense();
}
