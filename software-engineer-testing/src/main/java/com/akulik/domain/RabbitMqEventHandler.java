package com.akulik.domain;

import com.akulik.domain.model.UserCreationEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.akulik.config.RabbitMqConfig.QUEUE_NAME;

@Slf4j
@Component
@RequiredArgsConstructor
public class RabbitMqEventHandler {

    @RabbitListener(queues = QUEUE_NAME)
    public void handle(UserCreationEvent userCreationEvent) {
        log.info("Received userCreationEvent:{}: ", userCreationEvent);
    }

}

