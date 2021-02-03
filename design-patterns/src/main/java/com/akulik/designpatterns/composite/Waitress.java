package com.akulik.designpatterns.composite;

import com.akulik.designpatterns.composite.menu.Item;
import com.akulik.designpatterns.composite.menu.Menu;

import java.util.Iterator;

public class Waitress {

    Menu lunchMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu lunchMenu, Menu dinerMenu, Menu cafeMenu) {
        this.lunchMenu = lunchMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<Item> lunchIterator = lunchMenu.createIterator();
        Iterator<Item> dinerIterator = dinerMenu.createIterator();
        Iterator<Item> cafeIterator = cafeMenu.createIterator();
        System.out.println("Menu\n\nBreakfast:");
        printMenu(lunchIterator);
        System.out.println("\nLunch:");
        printMenu(dinerIterator);
        System.out.println("\nDinner");
        printMenu(cafeIterator);
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
