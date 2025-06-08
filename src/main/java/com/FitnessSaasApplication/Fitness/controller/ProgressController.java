package com.FitnessSaasApplication.Fitness.controller;

import com.FitnessSaasApplication.Fitness.model.UserProgress;
import com.FitnessSaasApplication.Fitness.repository.UserProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {

    @Autowired
    private UserProgressRepository userProgressRepository;

    @GetMapping
    public List<UserProgress> getAllProgress() {
        return userProgressRepository.findAll();
    }

    @PostMapping
    public UserProgress createProgress(@RequestBody UserProgress progress) {
        return userProgressRepository.save(progress);
    }

    @GetMapping("/{id}")
    public UserProgress getProgressById(@PathVariable Long id) {
        return userProgressRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public UserProgress updateProgress(@PathVariable Long id, @RequestBody UserProgress progressDetails) {
        return userProgressRepository.findById(id).map(progress -> {
            progress.setUser(progressDetails.getUser());
            progress.setProgressDate(progressDetails.getProgressDate());
            progress.setWeight(progressDetails.getWeight());
            progress.setBodyFatPercentage(progressDetails.getBodyFatPercentage());
            progress.setNotes(progressDetails.getNotes());
            return userProgressRepository.save(progress);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteProgress(@PathVariable Long id) {
        userProgressRepository.deleteById(id);
    }
}