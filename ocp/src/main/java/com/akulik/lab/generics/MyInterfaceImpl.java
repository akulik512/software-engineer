package com.akulik.lab.generics;

public class MyInterfaceImpl implements MyInterface {
  @Override
  public void handle() {
    System.out.println("Hello");
  }

  public void myPersonalMethod() {
    System.out.println("My personal Hello!");
  }
}
