package com.akulik.designpatterns.singleton.doublecheckedlocking;

public class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking uniqueInstance;

    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }

}
