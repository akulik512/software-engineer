package com.akulik.domain.listener;

import com.akulik.domain.listener.model.UserCreationEvent;
import com.akulik.domain.repository.UserEntity;
import com.akulik.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.akulik.config.RabbitMqConfig.QUEUE_NAME;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserCreationEventHandler {

    private final UserRepository userRepository;

    @RabbitListener(queues = QUEUE_NAME)
    public void handle(final UserCreationEvent userCreationEvent) {
        log.info("Received userCreationEvent:{}: ", userCreationEvent);
        final UserEntity userEntity = new UserEntity()
                .setId(userCreationEvent.getId())
                .setFirstname(userCreationEvent.getFirstname())
                .setSurname(userCreationEvent.getSurname());

        userRepository.insert(userEntity);
    }

}

