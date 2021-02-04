package com.akulik.designpatterns.composite.menu;

import com.akulik.designpatterns.composite.Item;

import java.util.ArrayList;
import java.util.Iterator;

public class LunchMenu implements Menu {

    private final ArrayList<Item> items;
    private final String menuName;

    public LunchMenu(final String menuName) {
        this.menuName = menuName;
        items = new ArrayList<>();

        addItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast",
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
        Item item = new Item(name, description, vegetarian, price);
        items.add(item);
    }

    @Override
    public Iterator<Item> createIterator() {
        return items.iterator();
    }

    @Override
    public String getName() {
        return menuName;
    }
}
