package com.akulik.designpatterns.iterator;

import com.akulik.designpatterns.iterator.menu.DinerMenu;
import com.akulik.designpatterns.iterator.menu.LunchMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Iterator")
class Iterator {

    @Test
    void example() {
        LunchMenu lunchMenu = new LunchMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(lunchMenu, dinerMenu);
        waitress.printMenu();
    }

}