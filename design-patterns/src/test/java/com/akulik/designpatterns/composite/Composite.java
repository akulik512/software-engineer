package com.akulik.designpatterns.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Composite")
class Composite {

    @Test
    void example() {
        final MenuComponent pancakeHouseMenu = given_pancakeMenu();
        final MenuComponent cafeMenu = given_cafeMenu();
        final MenuComponent dinerMenu = given_dinerMenu();
        final MenuComponent masterMenus = given_masterMenu(pancakeHouseMenu, dinerMenu, cafeMenu);

        Waitress waitress = new Waitress(masterMenus);
        waitress.printMenu();
    }

    private MenuComponent given_pancakeMenu() {
        final MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        pancakeHouseMenu.add(new MenuItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast",
                true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",
                false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries, and blueberry syrup",
                true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries",
                true, 3.59));
        return pancakeHouseMenu;
    }

    private MenuComponent given_cafeMenu() {
        final MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad",
                false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29));
        return cafeMenu;
    }

    private MenuComponent given_dinerMenu() {
        final MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin’) Bacon with lettuce & tomato on whole wheat",
                true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat",
                false,2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "(Fakin’) A bowl of the soup of the day, with a side of potato salad",
                false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,3.05));
        dinerMenu.add(new MenuItem("Soup of the day", "(Fakin’) A bowl of the soup of the day, with a side of potato salad",
                false, 3.29));
        dinerMenu.add(new MenuItem("Steamed Veggies and Brown Rice", "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,3.89));
        dinerMenu.add(new MenuItem("Pasta", "Steamed vegetables over brown rice",
                false,3.99));

        final MenuComponent dessertMenu = given_dessertMenu();
        dinerMenu.add(dessertMenu);

        return dinerMenu;
    }

    private MenuComponent given_dessertMenu() {
        final MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream",
                true, 1.59));
        dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust",
                true, 1.99));
        dessertMenu.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime",
                true, 1.89));
        return dessertMenu;
    }

    private MenuComponent given_masterMenu(MenuComponent pancakeHouseMenu, MenuComponent dinerMenu, MenuComponent cafeMenu) {
        MenuComponent masterMenus = new Menu("ALL MENUS", "All menus combined");
        masterMenus.add(pancakeHouseMenu);
        masterMenus.add(dinerMenu);
        masterMenus.add(cafeMenu);
        return masterMenus;
    }

}