package com.wojciechkniec.springAndMongo.config;

import com.wojciechkniec.springAndMongo.document.Users;
import com.wojciechkniec.springAndMongo.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                usersRepository.save(new Users(1, "John", "Bravo", 5000L));
                usersRepository.save(new Users(2, "Armando", "Newman", 3000L));
                usersRepository.save(new Users(3, "Ann", "Smith", 4000L));
                usersRepository.save(new Users(4, "Layla", "Strong", 2500L));
                usersRepository.save(new Users(5, "Donald", "Triumf", 35000L));
                usersRepository.save(new Users(6, "Arnold", "Black", 6500L));
            }
        };
    }
}
