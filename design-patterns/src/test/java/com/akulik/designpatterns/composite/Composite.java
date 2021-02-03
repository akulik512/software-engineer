package com.akulik.designpatterns.composite;

import com.akulik.designpatterns.composite.menu.CafeMenu;
import com.akulik.designpatterns.composite.menu.DinerMenu;
import com.akulik.designpatterns.composite.menu.LunchMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Composite")
class Composite {

    @Test
    void example() {
        LunchMenu lunchMenu = new LunchMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(lunchMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}