package com.wojciechkniec.springAndMongo.config;

import com.wojciechkniec.springAndMongo.repository.UsersRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {
}
