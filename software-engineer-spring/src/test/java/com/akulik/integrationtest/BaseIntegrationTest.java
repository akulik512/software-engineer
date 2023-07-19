package com.akulik.integrationtest;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.model.GetQueueUrlRequest;
import com.amazonaws.services.sqs.model.GetQueueUrlResult;
import com.amazonaws.services.sqs.model.PurgeQueueRequest;
import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.io.IOException;

import static com.akulik.integrationtest.BaseIntegrationTest.AwsSqsHelper.TEST_QUEUE_NAME;
import static org.testcontainers.containers.localstack.LocalStackContainer.Service.SQS;

@Testcontainers
public abstract class BaseIntegrationTest {

    @Container
    public static LocalStackContainer localStack =
            new LocalStackContainer(DockerImageName.parse("localstack/localstack:latest"))
                    .withServices(SQS);

    @Autowired
    public AmazonSQSAsync amazonSqsAsync;
    @Autowired
    public QueueMessagingTemplate queueMessagingTemplate;

    @BeforeAll
    static void beforeAll() throws IOException, InterruptedException {
        localStack.execInContainer("awslocal", "sqs", "create-queue", "--queue-name", TEST_QUEUE_NAME);

        String sqsEndpoint = String.valueOf(localStack.getEndpointOverride(LocalStackContainer.Service.SQS));
        localStack.execInContainer("awslocal", "sqs", "set-queue-attributes",
                "--queue-url", sqsEndpoint + "/" + TEST_QUEUE_NAME, "--attributes", "VisibilityTimeout", "43200");

        localStack.execInContainer("awslocal", "sqs", "list-queues");
    }

    @DynamicPropertySource
    static void overrideConfiguration(DynamicPropertyRegistry registry) {
        registry.add("cloud.aws.sqs.endpoint", () -> localStack.getEndpointOverride(SQS));
        registry.add("cloud.aws.credentials.access-key", localStack::getAccessKey);
        registry.add("cloud.aws.credentials.secret-key", localStack::getSecretKey);
        registry.add("cloud.aws.region.static", localStack::getRegion);

        registry.add("app.aws.queue", () -> TEST_QUEUE_NAME);
//        registry.add("cloud.aws.credentials.accessKey", localStack::getAccessKey);
//        registry.add("cloud.aws.credentials.secretKey", localStack::getSecretKey);
    }

    @AfterEach
    void afterEach() {
        AwsSqsHelper awsSqsHelper = new AwsSqsHelper();
//        awsSqsHelper.purgeQueue(TEST_QUEUE_NAME);
    }

    public class AwsSqsHelper {

        protected static final String TEST_QUEUE_NAME = "testcontainers_queue";

        public void purgeQueue(String queueName) {
            GetQueueUrlRequest queueUrlRequest = new GetQueueUrlRequest();
            queueUrlRequest.withQueueName(queueName);

            GetQueueUrlResult queueUrlResult = amazonSqsAsync.getQueueUrl(queueUrlRequest);

            String queueUrl = queueUrlResult.getQueueUrl();
            amazonSqsAsync.purgeQueueAsync(new PurgeQueueRequest(queueUrl));
        }

    }

}
