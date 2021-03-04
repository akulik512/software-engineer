package com.akulik.designpatterns.decorator;

public class DataSourceDecorator implements DataSource {

    private final DataSource wrapper;

    public DataSourceDecorator(DataSource source) {
        this.wrapper = source;
    }

    @Override
    public String printMessage(String message) {
        return wrapper.printMessage(message);
    }

}
