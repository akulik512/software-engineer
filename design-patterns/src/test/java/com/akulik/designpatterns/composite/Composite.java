package com.akulik.designpatterns.composite;

import com.akulik.designpatterns.composite.menu.CafeMenu;
import com.akulik.designpatterns.composite.menu.DinerMenu;
import com.akulik.designpatterns.composite.menu.LunchMenu;
import com.akulik.designpatterns.composite.menu.Menu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@DisplayName("Composite")
class Composite {

    @Test
    void example() {
        final ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new LunchMenu("Lunch"));
        menus.add(new DinerMenu("\nDinner"));
        menus.add(new CafeMenu("\nCafe"));

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}