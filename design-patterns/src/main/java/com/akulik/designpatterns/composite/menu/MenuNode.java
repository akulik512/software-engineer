package com.akulik.designpatterns.composite.menu;

import java.util.ArrayList;

public class MenuNode extends MenuComponent {

    ArrayList<MenuComponent> menuComponentList = new ArrayList<>();

    private final String name;
    private final String description;

    public MenuNode(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (MenuComponent component : menuComponentList) {
            component.print();
        }
    }
}
