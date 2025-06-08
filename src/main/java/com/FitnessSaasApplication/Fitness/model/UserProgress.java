package com.FitnessSaasApplication.Fitness.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_progress")
public class UserProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotNull(message = "La fecha de registro es obligatoria")
    @Column(name = "progress_date", nullable = false)
    private LocalDateTime progressDate;

    @Positive(message = "El peso debe ser positivo")
    @Column(name = "weight")
    private Double weight; // en kilogramos

    @Positive(message = "El porcentaje de grasa debe ser positivo")
    @Column(name = "body_fat_percentage")
    private Double bodyFatPercentage;

    @Column(name = "notes")
    private String notes;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public UserProgress() {}

    public UserProgress(User user, LocalDateTime progressDate, Double weight, Double bodyFatPercentage, String notes) {
        this.user = user;
        this.progressDate = progressDate;
        this.weight = weight;
        this.bodyFatPercentage = bodyFatPercentage;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getProgressDate() {
        return progressDate;
    }

    public void setProgressDate(LocalDateTime progressDate) {
        this.progressDate = progressDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(Double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    @Override
    public String toString() {
        return "UserProgress{" +
                "id=" + id +
                ", user=" + (user != null ? user.getId() : null) +
                ", progressDate=" + progressDate +
                ", weight=" + weight +
                ", bodyFatPercentage=" + bodyFatPercentage +
                ", notes='" + notes + '\'' +
                '}';
    }
}