package org.akulik.ocp.leetcode.designpatterns.state.state;

import org.akulik.ocp.leetcode.designpatterns.state.GumballMachine;

public class SoldOutState implements State {

  GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Nope");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Nope");
  }

  @Override
  public void turnCrank() {
    System.out.println("Nope");
  }

  @Override
  public void dispense() {
    System.out.println("Nope");
  }
}
