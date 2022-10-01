package org.akulik.designpatterns.templatemethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Template Method")
class TemplateMethodTest {

  @Test
  void example() {
    System.out.println("Make tea:");
    final CaffeineBeverage tea = new Tea();
    tea.prepareBeverage();

    System.out.println("\nMake coffee:");
    final CaffeineBeverage coffee = new Coffee();
    coffee.prepareBeverage();
  }
}
