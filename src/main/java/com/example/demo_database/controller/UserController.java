package com.example.demo_database.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo_database.model.User;
import com.example.demo_database.repository.UserRepositoryImpl;

@Controller 
@RequestMapping(path="/users")
public class UserController {

  @Autowired
  private UserRepositoryImpl userRepository;

  @GetMapping("")
  public @ResponseBody Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }

  @GetMapping("{id}")
  public @ResponseBody User getUser(@PathVariable Integer id) {

    if (id == 1) {
      return new User(1, "Taro", "taro@mail.com");
    }
    if (id == 2) {
      return new User(2, "Taro2", "taro2@mail.com");
    }


      Optional<User> user = userRepository.findById(id);
      if (user.isEmpty()) {
          return null;
      }
      return user.get();
  }
}