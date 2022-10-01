package org.akulik.ocp.leetcode.designpatterns.composite;

public class Waitress {

  private final MenuComponent allMenus;

  public Waitress(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }

  public void printMenu() {
    allMenus.print();
  }
}
