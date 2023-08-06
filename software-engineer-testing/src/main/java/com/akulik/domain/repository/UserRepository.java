package com.akulik.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {

    @Query("{ 'firstname' : ?0 }")
    Optional<UserEntity> findUsersByFirstname(String firstname);

}
