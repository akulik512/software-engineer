package com.akulik.designpatterns.decorator.encrypt;

public class PublishDataSource implements DataSource {

    @Override
    public String printMessage(final String message) {
        return message;
    }

}