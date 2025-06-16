package com.FitnessSaasApplication.Fitness.service;

import com.FitnessSaasApplication.Fitness.model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);
}