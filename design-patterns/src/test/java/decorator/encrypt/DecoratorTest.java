package decorator.encrypt;

import com.akulik.designpatterns.decorator.encrypt.DataSourceDecorator;
import com.akulik.designpatterns.decorator.encrypt.EncryptionDecorator;
import com.akulik.designpatterns.decorator.encrypt.PublishDataSource;
import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void shouldPublishMessage() {
        final PublishDataSource publishDataSource = new PublishDataSource();
        System.out.println(publishDataSource.printMessage("Important business feature!"));
    }

    @Test
    void shouldEncryptMessage() {
        final DataSourceDecorator encoded = new EncryptionDecorator(new PublishDataSource());
        System.out.println(encoded.printMessage("Important business feature!"));
    }

}