package com.akulik.designpatterns.observer;

public class CurrentConditionsDisplay implements Observer {

    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("Current conditions: %sF degrees and %s humidity and %shPa%n", temp, humidity, pressure);
    }

}
