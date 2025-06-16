package com.FitnessSaasApplication.Fitness.dto.response;

import java.time.LocalDateTime;

public class WorkoutSummaryResponse {
    private Long id;
    private String name;
    private Integer exerciseCount;
    private Integer durationMinutes;
    private LocalDateTime date;

    public WorkoutSummaryResponse() {}

    public WorkoutSummaryResponse(Long id, String name, Integer exerciseCount, Integer durationMinutes, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.exerciseCount = exerciseCount;
        this.durationMinutes = durationMinutes;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExerciseCount() {
        return exerciseCount;
    }

    public void setExerciseCount(Integer exerciseCount) {
        this.exerciseCount = exerciseCount;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}