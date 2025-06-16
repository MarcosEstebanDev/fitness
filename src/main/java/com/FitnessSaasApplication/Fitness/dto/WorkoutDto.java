package com.FitnessSaasApplication.Fitness.dto;

import java.time.LocalDateTime;
import java.util.List;

public class WorkoutDto {
    private Long id;
    private String name;
    private String description;
    private Integer durationMinutes;
    private List<String> exercises;
    private LocalDateTime date;

    public WorkoutDto() {}

    public WorkoutDto(Long id, String name, String description, Integer durationMinutes, List<String> exercises, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.durationMinutes = durationMinutes;
        this.exercises = exercises;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public void setExercises(List<String> exercises) {
        this.exercises = exercises;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}