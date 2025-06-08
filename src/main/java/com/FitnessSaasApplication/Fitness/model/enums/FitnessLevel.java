package com.FitnessSaasApplication.Fitness.model.enums;

public enum FitnessLevel {
    BEGINNER("Principiante - 0-6 meses de experiencia"),
    INTERMEDIATE("Intermedio - 6 meses a 2 años"),
    ADVANCED("Avanzado - Más de 2 años de experiencia"),
    EXPERT("Experto - Competidor o profesional");

    private final String description;

    FitnessLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}