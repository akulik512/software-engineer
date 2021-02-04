package com.akulik.designpatterns.composite.menu;

import com.akulik.designpatterns.composite.Item;

import java.util.ArrayList;
import java.util.Iterator;

public class CafeMenu implements Menu {

    private final ArrayList<Item> items;
    private final String menuName;

    public CafeMenu(final String menuName) {
        this.menuName = menuName;
        items = new ArrayList<>();

        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
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
