package com.akulik.designpatterns.decorator.encrypt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Decorator example 2")
class DecoratorTest {

    @Test
    void example() {
        final PublishDataSource publishDataSource = new PublishDataSource();
        System.out.println(publishDataSource.printMessage("Important business feature!"));

        final DataSourceDecorator encoded = new EncryptionDecorator(new PublishDataSource());
        System.out.println(encoded.printMessage("Important business feature!"));
    }

}