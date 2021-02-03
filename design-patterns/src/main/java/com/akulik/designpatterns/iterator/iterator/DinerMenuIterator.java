package com.akulik.designpatterns.iterator.iterator;

import com.akulik.designpatterns.iterator.menu.MenuItem;

public class DinerMenuIterator implements Iterator {

    private final MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
