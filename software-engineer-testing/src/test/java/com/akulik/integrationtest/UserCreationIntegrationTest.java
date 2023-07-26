package com.akulik.integrationtest;

import com.akulik.domain.listener.model.UserCreationEvent;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.akulik.config.RabbitMqConfig.EXCHANGE_NAME;
import static com.akulik.config.RabbitMqConfig.ROUTING_KEY;

@SpringBootTest
class UserCreationIntegrationTest extends AbstractIntegrationTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void shouldCreateUser() throws InterruptedException {
        final UserCreationEvent event = new UserCreationEvent()
                .setId(1)
                .setFirstname("Andrei")
                .setSurname("Kulik");

        rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY, event);

        Thread.sleep(100000);

//        await()
//                .atMost(10, SECONDS)
//                .untilAsserted(() -> {
//        });
    }

}
