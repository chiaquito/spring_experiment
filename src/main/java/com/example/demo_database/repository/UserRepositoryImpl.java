package com.example.demo_database.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo_database.model.User;



@Repository
public class UserRepositoryImpl implements UserRepository {
    public Optional<User> findById(Integer id) {
        return Optional.of(new User(1, "Alice", "alice@test.mail.com"));
    }

    public List<User> findAll() {
        return new ArrayList<User>();
    }    
}   