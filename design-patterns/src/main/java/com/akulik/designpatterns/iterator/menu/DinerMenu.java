package com.akulik.designpatterns.iterator.menu;

import com.akulik.designpatterns.iterator.iterator.DinerMenuIterator;
import com.akulik.designpatterns.iterator.iterator.Iterator;

public class DinerMenu {

    private final MenuItem[] menuItems;
    private static final int MAX_ITEMS = 6;
    private int currentPosition = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin’) Bacon with lettuce & tomato on whole wheat",
                true, 2.99);

        addItem("BLT", "Bacon with lettuce & tomato on whole wheat",
                false, 2.99);

        addItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.29);

        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (currentPosition >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can’t add item to menu");
        } else {
            menuItems[currentPosition] = menuItem;
            currentPosition = currentPosition + 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
