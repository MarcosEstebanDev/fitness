package com.FitnessSaasApplication.Fitness.repository;

import com.FitnessSaasApplication.Fitness.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}