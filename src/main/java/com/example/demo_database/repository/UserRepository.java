package com.example.demo_database.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo_database.model.User;

public interface UserRepository {
    Optional<User> findById(Integer id);
    List<User> findAll();
}
