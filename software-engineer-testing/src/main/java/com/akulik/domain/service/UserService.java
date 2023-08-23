package com.akulik.domain.service;

import com.akulik.domain.listener.model.UserCreationEvent;
import com.akulik.domain.repository.UserEntity;
import com.akulik.domain.repository.UserRepository;
import com.akulik.domain.s3.AwsS3Manager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final AwsS3Manager awsS3Manager;

    public void saveUser(final UserCreationEvent userCreationEvent) {
        final UserEntity userEntity = new UserEntity()
                .setId(userCreationEvent.getId())
                .setFirstname(userCreationEvent.getFirstname())
                .setSurname(userCreationEvent.getSurname());

        userRepository.insert(userEntity);
        log.info("The user is stored in the database");

        awsS3Manager.updateRegistry(String.format("%s %s %s",
                userEntity.getId(), userEntity.getFirstname(), userEntity.getSurname()));
        log.info("The user's greeting is loaded");
    }

}
