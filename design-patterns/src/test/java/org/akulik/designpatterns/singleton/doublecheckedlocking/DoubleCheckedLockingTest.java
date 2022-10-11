package org.akulik.designpatterns.singleton.doublecheckedlocking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

@DisplayName("Singleton Double Checked Locking")
class DoubleCheckedLockingTest {

  @Test
  void example() {
    int start;
    int finish;

    start = LocalDateTime.now().getNano();
    DoubleCheckedLocking.getInstance();
    finish = LocalDateTime.now().getNano();

    System.out.println("--- Run execution time: = " + (finish - start));
  }
}
