package com.akulik.designpatterns.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Decorator example")
class DecoratorTest {

  @Test
  void example() {
    final PublishDataSource publishDataSource = new PublishDataSource();
    System.out.print("Original message: ");
    System.out.println(publishDataSource.printMessage("Important business feature!"));

    System.out.print("Decorated message: ");
    final DataSourceDecorator encoded = new EncryptionDecorator(publishDataSource);
    System.out.println(encoded.printMessage("Important business feature!"));
  }
}
