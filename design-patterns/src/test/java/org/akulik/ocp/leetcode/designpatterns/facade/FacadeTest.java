package org.akulik.ocp.leetcode.designpatterns.facade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Facade")
class FacadeTest {

  @Test
  void example() {
    final ShapeFacade shapeFacade = new ShapeFacade();

    shapeFacade.draw();
  }
}
