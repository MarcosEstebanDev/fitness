package com.FitnessSaasApplication.Fitness.model;


import com.FitnessSaasApplication.Fitness.model.enums.EquipmentType;
import com.FitnessSaasApplication.Fitness.model.enums.ExerciseType;
import com.FitnessSaasApplication.Fitness.model.enums.MuscleGroup;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre del ejercicio es obligatorio")
    @Size(max = 100, message = "El nombre no puede exceder 100 caracteres")
    @Column(nullable = false, unique = true)
    private String name;

    @Size(max = 500, message = "La descripción no puede exceder 500 caracteres")
    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "primary_muscle_group", nullable = false)
    private MuscleGroup primaryMuscleGroup;

    @ElementCollection(targetClass = MuscleGroup.class)
    @CollectionTable(name = "exercise_secondary_muscles",
            joinColumns = @JoinColumn(name = "exercise_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "muscle_group")
    private Set<MuscleGroup> secondaryMuscleGroups = new HashSet<>();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ExerciseType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EquipmentType equipment;

    @Column(name = "difficulty_level")
    private Integer difficultyLevel; // 1-5 (1=muy fácil, 5=muy difícil)

    @Column(columnDefinition = "TEXT")
    private String instructions;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "calories_per_minute")
    private Double caloriesPerMinute;

    @Column(name = "is_active")
    private Boolean isActive = true;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // Constructores
    public Exercise() {}

    public Exercise(String name, MuscleGroup primaryMuscleGroup, ExerciseType type, EquipmentType equipment) {
        this.name = name;
        this.primaryMuscleGroup = primaryMuscleGroup;
        this.type = type;
        this.equipment = equipment;
    }

    // Getters y Setters
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

    public MuscleGroup getPrimaryMuscleGroup() {
        return primaryMuscleGroup;
    }

    public void setPrimaryMuscleGroup(MuscleGroup primaryMuscleGroup) {
        this.primaryMuscleGroup = primaryMuscleGroup;
    }

    public Set<MuscleGroup> getSecondaryMuscleGroups() {
        return secondaryMuscleGroups;
    }

    public void setSecondaryMuscleGroups(Set<MuscleGroup> secondaryMuscleGroups) {
        this.secondaryMuscleGroups = secondaryMuscleGroups;
    }

    public ExerciseType getType() {
        return type;
    }

    public void setType(ExerciseType type) {
        this.type = type;
    }

    public EquipmentType getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentType equipment) {
        this.equipment = equipment;
    }

    public Integer getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(Integer difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Double getCaloriesPerMinute() {
        return caloriesPerMinute;
    }

    public void setCaloriesPerMinute(Double caloriesPerMinute) {
        this.caloriesPerMinute = caloriesPerMinute;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Métodos de utilidad
    public void addSecondaryMuscleGroup(MuscleGroup muscleGroup) {
        this.secondaryMuscleGroups.add(muscleGroup);
    }

    public void removeSecondaryMuscleGroup(MuscleGroup muscleGroup) {
        this.secondaryMuscleGroups.remove(muscleGroup);
    }

    public boolean isCardio() {
        return this.type == ExerciseType.CARDIO;
    }

    public boolean isStrength() {
        return this.type == ExerciseType.STRENGTH;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", primaryMuscleGroup=" + primaryMuscleGroup +
                ", type=" + type +
                ", equipment=" + equipment +
                '}';
    }
}