package com.FitnessSaasApplication.Fitness.service.impl;

import com.FitnessSaasApplication.Fitness.exception.ResourceNotFoundException;
import com.FitnessSaasApplication.Fitness.model.UserProgress;
import com.FitnessSaasApplication.Fitness.repository.UserProgressRepository;
import com.FitnessSaasApplication.Fitness.service.UserProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProgressServiceImpl implements UserProgressService {

    @Autowired
    private UserProgressRepository userProgressRepository;

    @Override
    public UserProgress createUserProgress(UserProgress userProgress) {
        return userProgressRepository.save(userProgress);
    }

    @Override
    public UserProgress getUserProgressById(Long id) {
        return userProgressRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Progreso de usuario no encontrado"));
    }

    @Override
    public List<UserProgress> getAllUserProgress() {
        return userProgressRepository.findAll();
    }

    @Override
    public void deleteUserProgress(Long id) {
        if (!userProgressRepository.existsById(id)) {
            throw new ResourceNotFoundException("Progreso de usuario no encontrado");
        }
        userProgressRepository.deleteById(id);
    }
}