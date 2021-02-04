package com.akulik.designpatterns.composite.menu;

import com.akulik.designpatterns.composite.Item;

import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenu implements Menu {

    private final ArrayList<Item> items;
    private final String menuName;

    public DinerMenu(final String menuName) {
        this.menuName = menuName;
        items = new ArrayList<>();

        addItem("Vegetarian BLT", "(Fakin’) Bacon with lettuce & tomato on whole wheat",
                true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat",
                false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
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
