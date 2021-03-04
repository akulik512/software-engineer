package com.akulik.designpatterns.iterator.menu;

import com.akulik.designpatterns.iterator.iterator.Iterator;
import com.akulik.designpatterns.iterator.iterator.LunchMenuIterator;

import java.util.ArrayList;

public class LunchMenu {

    private final ArrayList<MenuItem> menuItems;

    public LunchMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast",
                true, 2.99);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",
                false, 2.99);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
                true, 3.49);

        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries",
                true, 3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }

}
