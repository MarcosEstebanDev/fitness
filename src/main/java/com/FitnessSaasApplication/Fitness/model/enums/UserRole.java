package com.FitnessSaasApplication.Fitness.model.enums;

public enum UserRole {
    USER("Usuario básico"),
    TRAINER("Entrenador personal"),
    ADMIN("Administrador del sistema");

    private final String description;

    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
