package com.akulik.designpatterns.composite.menu;

import java.util.Iterator;

public interface Menu {
    Iterator<Item> createIterator();
}
