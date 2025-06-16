package com.FitnessSaasApplication.Fitness.service;

import com.FitnessSaasApplication.Fitness.model.UserProgress;
import java.util.List;

public interface UserProgressService {
    UserProgress createUserProgress(UserProgress userProgress);
    UserProgress getUserProgressById(Long id);
    List<UserProgress> getAllUserProgress();
    void deleteUserProgress(Long id);
}