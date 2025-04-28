package com.example.customservice.controller;

import com.example.customservice.model.User;
import com.example.customservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/custom-service-1/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return repository.save(user);
    }
}