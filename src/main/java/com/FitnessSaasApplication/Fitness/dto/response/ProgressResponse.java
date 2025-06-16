package com.FitnessSaasApplication.Fitness.dto.response;

import java.time.LocalDateTime;

public class ProgressResponse {
    private Long userId;
    private Long workoutId;
    private Integer setsCompleted;
    private LocalDateTime lastUpdated;
    private String notes;

    public ProgressResponse() {}

    public ProgressResponse(Long userId, Long workoutId, Integer setsCompleted, LocalDateTime lastUpdated, String notes) {
        this.userId = userId;
        this.workoutId = workoutId;
        this.setsCompleted = setsCompleted;
        this.lastUpdated = lastUpdated;
        this.notes = notes;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(Long workoutId) {
        this.workoutId = workoutId;
    }

    public Integer getSetsCompleted() {
        return setsCompleted;
    }

    public void setSetsCompleted(Integer setsCompleted) {
        this.setsCompleted = setsCompleted;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}