package com.FitnessSaasApplication.Fitness.controller;

import com.FitnessSaasApplication.Fitness.model.User;
import com.FitnessSaasApplication.Fitness.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return userRepository.findById(id).map(user -> {
            user.setEmail(userDetails.getEmail());
            user.setPassword(userDetails.getPassword());
            user.setFirstName(userDetails.getFirstName());
            user.setLastName(userDetails.getLastName());
            user.setRole(userDetails.getRole());
            user.setFitnessLevel(userDetails.getFitnessLevel());
            user.setAge(userDetails.getAge());
            user.setWeight(userDetails.getWeight());
            user.setHeight(userDetails.getHeight());
            user.setPhoneNumber(userDetails.getPhoneNumber());
            user.setProfileImageUrl(userDetails.getProfileImageUrl());
            user.setIsActive(userDetails.getIsActive());
            user.setEmailVerified(userDetails.getEmailVerified());
            return userRepository.save(user);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}