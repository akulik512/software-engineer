package org.akulik.ocp.leetcode.designpatterns.observer;

import java.util.ArrayList;

public class WeatherData implements Observable {

  private final ArrayList<Observer> observers = new ArrayList<>();

  private float temp;
  private float humidity;
  private float pressure;

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int index = observers.indexOf(o);
    if (index >= 0) {
      observers.remove(index);
    }
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temp, humidity, pressure);
    }
  }

  public void setTestData(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyObservers();
  }
}
