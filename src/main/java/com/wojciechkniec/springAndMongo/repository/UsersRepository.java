package com.wojciechkniec.springAndMongo.repository;

import com.wojciechkniec.springAndMongo.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, Integer> {
    public Users findOneByName(String name);
}
