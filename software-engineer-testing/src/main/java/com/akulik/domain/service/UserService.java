package com.akulik.domain.service;

import com.akulik.domain.listener.model.UserCreationEvent;
import com.akulik.domain.repository.UserEntity;
import com.akulik.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void saveUser(final UserCreationEvent userCreationEvent) {
        final UserEntity userEntity = new UserEntity()
                .setId(userCreationEvent.getId())
                .setFirstname(userCreationEvent.getFirstname())
                .setSurname(userCreationEvent.getSurname());

        userRepository.insert(userEntity);
        log.info("The user is stored in the database");
    }

}
