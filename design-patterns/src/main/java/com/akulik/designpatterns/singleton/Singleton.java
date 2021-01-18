package com.akulik.designpatterns.singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
        System.out.println("Singleton");
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}