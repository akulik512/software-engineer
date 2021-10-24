package com.akulik.designpatterns.singleton;

import java.time.LocalDateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Singleton")
class SingletonTest {

  @Test
  void example() {
    int start;
    int finish;

    start = LocalDateTime.now().getNano();
    Singleton.getInstance();
    finish = LocalDateTime.now().getNano();

    System.out.println("--- Run execution time: = " + (finish - start));
  }
}
