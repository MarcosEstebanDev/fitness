package com.FitnessSaasApplication.Fitness.controller;

import com.FitnessSaasApplication.Fitness.model.Exercise;
import com.FitnessSaasApplication.Fitness.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @GetMapping
    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }

    @PostMapping
    public Exercise createExercise(@RequestBody Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @GetMapping("/{id}")
    public Exercise getExerciseById(@PathVariable Long id) {
        return exerciseRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Exercise updateExercise(@PathVariable Long id, @RequestBody Exercise exerciseDetails) {
        return exerciseRepository.findById(id).map(exercise -> {
            exercise.setName(exerciseDetails.getName());
            exercise.setDescription(exerciseDetails.getDescription());
            exercise.setPrimaryMuscleGroup(exerciseDetails.getPrimaryMuscleGroup());
            exercise.setSecondaryMuscleGroups(exerciseDetails.getSecondaryMuscleGroups());
            exercise.setType(exerciseDetails.getType());
            exercise.setEquipment(exerciseDetails.getEquipment());
            exercise.setDifficultyLevel(exerciseDetails.getDifficultyLevel());
            exercise.setInstructions(exerciseDetails.getInstructions());
            exercise.setImageUrl(exerciseDetails.getImageUrl());
            exercise.setVideoUrl(exerciseDetails.getVideoUrl());
            exercise.setCaloriesPerMinute(exerciseDetails.getCaloriesPerMinute());
            exercise.setIsActive(exerciseDetails.getIsActive());
            return exerciseRepository.save(exercise);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteExercise(@PathVariable Long id) {
        exerciseRepository.deleteById(id);
    }
}