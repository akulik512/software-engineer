package com.akulik.designpatterns.singleton.doublecheckedlocking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

@DisplayName("Singleton Double Checked Locking")
class DoubleCheckedLockingTest {

    @Test
    void example() {
        final int start;
        final int finish;

        System.out.println("--- Start");
        start = LocalDateTime.now().getNano();

        DoubleCheckedLocking.getInstance();

        finish = LocalDateTime.now().getNano();
        System.out.println("--- Finish");
        System.out.println("--- Result: start = " + (finish - start));
    }

}