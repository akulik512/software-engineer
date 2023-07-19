package com.akulik.service;

import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ServiceListener {

    @SqsListener(value = "${app.aws.queue}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void consume(@Payload final UserModel userModel) {
        log.info("Event: {}", userModel);
    }

}
