package com.FitnessSaasApplication.Fitness.model.enums;

public enum WorkoutStatus {
    PLANNED("Planificado"),
    IN_PROGRESS("En progreso"),
    COMPLETED("Completado"),
    CANCELLED("Cancelado"),
    PAUSED("Pausado");

    private final String displayName;

    WorkoutStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}