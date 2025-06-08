package com.FitnessSaasApplication.Fitness.repository;

import com.FitnessSaasApplication.Fitness.model.UserProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProgressRepository extends JpaRepository<UserProgress, Long> {
}