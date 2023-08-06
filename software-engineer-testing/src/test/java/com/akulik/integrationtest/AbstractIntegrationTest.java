package com.akulik.integrationtest;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.containers.RabbitMQContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@SpringBootTest
@Testcontainers
public abstract class AbstractIntegrationTest {

    @Container
    static final RabbitMQContainer rabbitMq =
            new RabbitMQContainer(DockerImageName.parse("rabbitmq:3.12.2-alpine"));

    @Container
    static final MongoDBContainer mongoDb =
            new MongoDBContainer(DockerImageName.parse("mongo:5.0.19"));

    @DynamicPropertySource
    static void overridePropertiesInternal(DynamicPropertyRegistry registry) {
        registry.add("spring.rabbitmq.host", rabbitMq::getHost);
        registry.add("spring.rabbitmq.port", rabbitMq::getAmqpPort);
        registry.add("spring.rabbitmq.username", rabbitMq::getAdminUsername);
        registry.add("spring.rabbitmq.password", rabbitMq::getAdminPassword);

        registry.add("spring.data.mongodb.uri", () -> mongoDb.getReplicaSetUrl("test"));
    }

}
