package com.akulik.designpatterns.decorator;

public class PublishDataSource implements DataSource {

  @Override
  public String printMessage(String message) {
    return message;
  }
}
