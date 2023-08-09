package com.akulik.integrationtest;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.containers.RabbitMQContainer;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.io.IOException;

import static org.testcontainers.containers.localstack.LocalStackContainer.Service.S3;

@Testcontainers
@SpringBootTest
public abstract class AbstractIntegrationTest {

    private static final String BUCKET_NAME = "greetings-test-bucket";

    @Container
    private static final RabbitMQContainer RABBIT_MQ =
            new RabbitMQContainer(DockerImageName.parse("rabbitmq:3.12.2-alpine"));

    @Container
    private static final MongoDBContainer MONGO_DB =
            new MongoDBContainer(DockerImageName.parse("mongo:5.0.19"));

    @Container
    private static final LocalStackContainer LOCAL_STACK =
            new LocalStackContainer(DockerImageName.parse("localstack/localstack:latest"))
                    .withServices(S3);

    @BeforeAll
    static void beforeAll() throws IOException, InterruptedException {
        LOCAL_STACK.execInContainer("awslocal", "s3api", "create-bucket", "--bucket " + BUCKET_NAME);
        LOCAL_STACK.execInContainer("awslocal", "s3", "mb", "s3://" + BUCKET_NAME);
    }


    @DynamicPropertySource
    static void overrideApplicationProperties(final DynamicPropertyRegistry registry) {
        registry.add("spring.rabbitmq.host", RABBIT_MQ::getHost);
        registry.add("spring.rabbitmq.port", RABBIT_MQ::getAmqpPort);
        registry.add("spring.rabbitmq.username", RABBIT_MQ::getAdminUsername);
        registry.add("spring.rabbitmq.password", RABBIT_MQ::getAdminPassword);

        registry.add("spring.data.mongodb.uri", () -> MONGO_DB.getReplicaSetUrl("test"));

        registry.add("spring.cloud.aws.s3.endpoint", () -> LOCAL_STACK.getEndpointOverride(S3));
        registry.add("spring.cloud.aws.s3.region", LOCAL_STACK::getRegion);
        registry.add("spring.cloud.aws.region.static", LOCAL_STACK::getRegion);
        registry.add("spring.cloud.aws.credentials.access-key", LOCAL_STACK::getAccessKey);
        registry.add("spring.cloud.aws.credentials.secret-key", LOCAL_STACK::getSecretKey);
        registry.add("app.bucket-name", () -> BUCKET_NAME);
    }

}
