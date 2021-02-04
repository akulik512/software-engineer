package com.akulik.designpatterns.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Composite")
class Composite {

    @Test
    void example() {
        final MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        final MenuComponent dinerMenu = new Menu("PDINER MENU", "Lunch");
        final MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        final MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream",
                true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}