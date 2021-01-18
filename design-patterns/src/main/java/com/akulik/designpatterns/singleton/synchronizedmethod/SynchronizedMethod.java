package com.akulik.designpatterns.singleton.synchronizedmethod;

public class SynchronizedMethod {
    private static SynchronizedMethod uniqueInstance;

    private SynchronizedMethod() {
        System.out.println("Synchronized Method Singleton");
    }

    public static synchronized SynchronizedMethod getInstance() {
        if (uniqueInstance == null) uniqueInstance = new SynchronizedMethod();
        return uniqueInstance;
    }
}
