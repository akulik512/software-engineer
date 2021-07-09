package com.akulik.designpatterns.iterator.iterator;

import com.akulik.designpatterns.iterator.menu.MenuItem;

import java.util.ArrayList;

public class LunchMenuIterator implements Iterator {

  private final ArrayList<MenuItem> items;
  private int position = 0;

  public LunchMenuIterator(ArrayList<MenuItem> items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return position < items.size();
  }

  @Override
  public MenuItem next() {
    MenuItem menuItem = items.get(position);
    position = position + 1;
    return menuItem;
  }
}
