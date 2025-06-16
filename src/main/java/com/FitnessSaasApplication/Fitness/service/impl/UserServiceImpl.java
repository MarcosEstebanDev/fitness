package com.FitnessSaasApplication.Fitness.service.impl;

import com.FitnessSaasApplication.Fitness.exception.EmailAlreadyExistsException;
import com.FitnessSaasApplication.Fitness.exception.ResourceNotFoundException;
import com.FitnessSaasApplication.Fitness.model.User;
import com.FitnessSaasApplication.Fitness.repository.UserRepository;
import com.FitnessSaasApplication.Fitness.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new EmailAlreadyExistsException("El email ya está registrado");
        }
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));
    }

    @Override
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException("Usuario no encontrado");
        }
        userRepository.deleteById(id);
    }
}