package com.akulik.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.akulik")
public class MongoDbConfig {

    @Bean
    public MongoClient mongoClient(final @Value("${spring.data.mongodb.uri}") String url) {
        return MongoClients.create(url);
    }

    @Bean
    public MongoTemplate mongoTemplate(final MongoClient mongo,
                                       final @Value("${spring.data.mongodb.database}") String databaseName) {
        final MongoTemplate mongoTemplate = new MongoTemplate(mongo, databaseName);
        mongoTemplate.createCollection("users");
        return mongoTemplate;
    }

}
