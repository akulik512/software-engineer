package org.akulik.designpatterns.singleton.synchronizedmethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

@DisplayName("Singleton Synchronized Method")
class SynchronizedMethodTest {

  @Test
  void example() {
    int start;
    int finish;

    start = LocalDateTime.now().getNano();
    SynchronizedMethod.getInstance();
    finish = LocalDateTime.now().getNano();

    System.out.println("--- Run execution time: = " + (finish - start));
  }
}
