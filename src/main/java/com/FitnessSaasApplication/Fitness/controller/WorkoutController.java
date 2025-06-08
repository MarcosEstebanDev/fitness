package com.FitnessSaasApplication.Fitness.controller;

import com.FitnessSaasApplication.Fitness.model.Workout;
import com.FitnessSaasApplication.Fitness.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutRepository workoutRepository;

    @GetMapping
    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout) {
        return workoutRepository.save(workout);
    }

    @GetMapping("/{id}")
    public Workout getWorkoutById(@PathVariable Long id) {
        return workoutRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Workout updateWorkout(@PathVariable Long id, @RequestBody Workout workoutDetails) {
        return workoutRepository.findById(id).map(workout -> {
            workout.setName(workoutDetails.getName());
            workout.setDescription(workoutDetails.getDescription());
            workout.setUser(workoutDetails.getUser());
            return workoutRepository.save(workout);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkout(@PathVariable Long id) {
        workoutRepository.deleteById(id);
    }
}