package com.akulik.domain.listener;

import com.akulik.domain.listener.model.UserCreationEvent;
import com.akulik.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.akulik.config.RabbitMqConfig.QUEUE_NAME;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserCreationEventHandler {

    private final UserService userService;

    @RabbitListener(queues = QUEUE_NAME)
    public void handle(final UserCreationEvent userCreationEvent) {
        log.info("User creation event received: {}: ", userCreationEvent);
        userService.saveUser(userCreationEvent);
    }

}

