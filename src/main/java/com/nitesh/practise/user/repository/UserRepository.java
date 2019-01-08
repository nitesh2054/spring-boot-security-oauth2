package com.nitesh.practise.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nitesh.practise.user.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByUsername(String username);

}
