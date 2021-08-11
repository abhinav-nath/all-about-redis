package com.codecafe.redis.kickstart.controller;

import com.codecafe.redis.kickstart.model.User;
import com.codecafe.redis.kickstart.persistence.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/redis/user")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping()
    public User createUser(@RequestBody User user) {
        userRepository.save(user);
        return userRepository.findById(user.getId());
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        userRepository.save(user);
        return userRepository.findById(user.getId());
    }

    @GetMapping()
    public Map<String, User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@RequestParam(name = "id") String id) {
        return userRepository.findById(id);
    }

}
