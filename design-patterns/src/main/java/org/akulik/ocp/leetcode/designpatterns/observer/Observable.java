package org.akulik.ocp.leetcode.designpatterns.observer;

public interface Observable {

  void registerObserver(Observer o);

  void removeObserver(Observer o);

  void notifyObservers();
}
