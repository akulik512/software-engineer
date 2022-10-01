package org.akulik.ocp.leetcode.designpatterns.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

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
