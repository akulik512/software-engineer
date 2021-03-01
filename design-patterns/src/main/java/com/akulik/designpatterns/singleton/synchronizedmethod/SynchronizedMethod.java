package com.akulik.designpatterns.singleton.synchronizedmethod;

public class SynchronizedMethod {

    private static SynchronizedMethod uniqueInstance;

    private SynchronizedMethod() {}

    public static synchronized SynchronizedMethod getInstance() {
        if (uniqueInstance == null) uniqueInstance = new SynchronizedMethod();
        return uniqueInstance;
    }

}
