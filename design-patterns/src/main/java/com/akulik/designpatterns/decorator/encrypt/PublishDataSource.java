package com.akulik.designpatterns.decorator.encrypt;

public class PublishDataSource implements DataSource {

    @Override
    public String printMessage(String message) {
        return message;
    }

}