package com.akulik.integrationtest;

import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.messaging.support.GenericMessage;

import java.util.Map;

import static com.akulik.integrationtest.BaseIntegrationTest.AwsSqsHelper.TEST_QUEUE_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConsumerIntegrationTest extends BaseIntegrationTest {

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @Autowired
    private Environment environment;

    @Test
    void testConsumer() throws InterruptedException {
        queueMessagingTemplate.send(TEST_QUEUE_NAME, new GenericMessage<>("""
                {
                    "firstname": "Andrei",
                    "surname": "Kulik"
                }
                """,
                Map.of("contentType", "application/json")));

        Thread.sleep(1000);

//        await()
//                .atLeast(1, TimeUnit.SECONDS)
//                .atMost(5, TimeUnit.MINUTES)
//                .pollInterval(1, TimeUnit.SECONDS)
//                .untilAsserted(() -> {
//
//                });
    }

    @Test
    void testApplicationProperties() {
        String accessKey = environment.getProperty("cloud.aws.credentials.accessKey");
        String secretKey = environment.getProperty("cloud.aws.credentials.secretKey");
        String region = environment.getProperty("cloud.aws.region.static");
        String queueName = environment.getProperty("app.aws.queue");

        assertEquals("accesskey", accessKey);
        assertEquals("secretkey", secretKey);
        assertEquals("us-east-1", region);
        assertEquals("testcontainers_queue", queueName);
    }


}
