package org.akulik.ocp.leetcode.designpatterns.state;

import org.akulik.ocp.leetcode.designpatterns.state.state.*;

public class GumballMachine {

  private final State soldOutState;
  private final State noQuarterState;
  private final State hasQuarterState;
  private final State soldState;

  private State state;
  private int countOfGumballs;

  public GumballMachine(int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);

    this.countOfGumballs = numberGumballs;
    initializeState(numberGumballs);
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (countOfGumballs != 0) {
      countOfGumballs = countOfGumballs - 1;
    }
  }

  private void initializeState(int numberGumballs) {
    if (numberGumballs > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public int getCountOfGumballs() {
    return countOfGumballs;
  }

  @Override
  public String toString() {
    return "GumballMachine{"
        + "state="
        + state.getClass().getSimpleName()
        + ", countOfGumballs="
        + countOfGumballs
        + '}';
  }
}
