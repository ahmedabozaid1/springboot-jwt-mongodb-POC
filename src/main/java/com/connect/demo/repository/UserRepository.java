package com.connect.demo.repository;

import com.connect.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    User findByEmail(String email);
    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);
    User findByUsername(String userName);

}
