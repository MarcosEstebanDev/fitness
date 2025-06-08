package com.FitnessSaasApplication.Fitness.model.enums;

public enum ExerciseType {
    STRENGTH("Fuerza"),
    CARDIO("Cardiovascular"),
    FLEXIBILITY("Flexibilidad"),
    BALANCE("Equilibrio"),
    PLYOMETRIC("Pliométrico"),
    POWERLIFTING("Powerlifting"),
    OLYMPIC("Levantamiento olímpico");

    private final String displayName;

    ExerciseType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}