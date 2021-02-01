package com.akulik.designpatterns.iterator;

import com.akulik.designpatterns.iterator.iterator.Iterator;
import com.akulik.designpatterns.iterator.menu.DinerMenu;
import com.akulik.designpatterns.iterator.menu.MenuItem;
import com.akulik.designpatterns.iterator.menu.LunchMenu;

public class Waitress {

    LunchMenu lunchMenu;
    DinerMenu dinerMenu;

    public Waitress(LunchMenu lunchMenu, DinerMenu dinerMenu) {
        this.lunchMenu = lunchMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = lunchMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("Menu\n\nBreakfast:");
        printMenu(pancakeIterator);
        System.out.println("\nLunch:");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
