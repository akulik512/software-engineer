package com.akulik.designpatterns.composite;

import com.akulik.designpatterns.composite.menu.Menu;

import java.util.Iterator;
import java.util.List;

public class Waitress {

    List<Menu> menuList;

    public Waitress(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        for (Menu menu : menuList) {
            System.out.println(menu.getName());
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<Item> iterator) {
        while (iterator.hasNext()) {
            Item menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
