package com.akulik.designpatterns.composite.menu;

import com.akulik.designpatterns.composite.Item;

import java.util.Iterator;

public interface Menu {
    String getName();
    Iterator<Item> createIterator();
}
