package com.akulik.designpatterns.composite;

import com.akulik.designpatterns.composite.menu.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Composite")
class Composite {

    @Test
    void example() {
        final MenuComponent menuNode1 = new MenuNode("PANCAKE HOUSE MENU", "Breakfast");
        final MenuComponent menuNode2 = new MenuNode("PDINER MENU", "Lunch");
        final MenuComponent menuNode3 = new MenuNode("CAFE MENU", "Dinner");
        final MenuComponent menuNode4 = new MenuNode("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new MenuNode("ALL MENUS", "All menus combined");

        allMenus.add(menuNode1);
        allMenus.add(menuNode2);
        allMenus.add(menuNode3);

        menuNode2.add(new Item(
                "Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89));

        menuNode2.add(menuNode2);

        menuNode4.add(new Item(
                "Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream",
                true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}