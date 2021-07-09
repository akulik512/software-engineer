package com.akulik.designpatterns.observer;

public class CurrentConditionsDisplay implements Observer {

  public CurrentConditionsDisplay(Observable weatherData) {
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    System.out.printf(
        "Current conditions: %sF degrees and %s humidity and %shPa%n", temp, humidity, pressure);
  }
}
