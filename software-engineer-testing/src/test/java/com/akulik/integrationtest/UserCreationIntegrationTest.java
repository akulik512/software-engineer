package com.akulik.integrationtest;

import com.akulik.domain.listener.model.UserCreationEvent;
import com.akulik.domain.repository.UserEntity;
import com.akulik.domain.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;

import java.util.Optional;

import static com.akulik.config.RabbitMqConfig.EXCHANGE_NAME;
import static com.akulik.config.RabbitMqConfig.ROUTING_KEY;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.testcontainers.shaded.org.awaitility.Awaitility.await;

@SpringBootTest
class UserCreationIntegrationTest extends AbstractIntegrationTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("s3://mybucket/samplefile.txt")
    private Resource s3SampleFile;

    @Test
    void shouldCreateUser() {
        final UserCreationEvent event = new UserCreationEvent()
                .setId(1)
                .setFirstname("Bruce")
                .setSurname("Wayne");

        rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY, event);

        await()
                .atMost(20, SECONDS)
                .untilAsserted(() -> {
                    verifyIsUserSavedInDatabase();
                    assertThat(s3SampleFile.exists())
                            .as("File exist in S3")
                            .isTrue();
                });
    }

    private void verifyIsUserSavedInDatabase() {
        final UserEntity expectedUserEntity = new UserEntity()
                .setId(1)
                .setFirstname("Bruce")
                .setSurname("Wayne");

        final Optional<UserEntity> foundUserEntity = userRepository.findUsersByFirstname("Bruce");

        assertThat(foundUserEntity)
                .as("User is present in DB")
                .isPresent()
                .hasValue(expectedUserEntity);
    }


}
