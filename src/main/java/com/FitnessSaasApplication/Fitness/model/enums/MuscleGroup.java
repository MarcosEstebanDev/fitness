package com.FitnessSaasApplication.Fitness.model.enums;

public enum MuscleGroup {
    CHEST("Pecho"),
    BACK("Espalda"),
    SHOULDERS("Hombros"),
    BICEPS("Bíceps"),
    TRICEPS("Tríceps"),
    FOREARMS("Antebrazos"),
    ABS("Abdominales"),
    OBLIQUES("Oblicuos"),
    LOWER_BACK("Espalda baja"),
    QUADRICEPS("Cuádriceps"),
    HAMSTRINGS("Isquiotibiales"),
    GLUTES("Glúteos"),
    CALVES("Pantorrillas"),
    FULL_BODY("Cuerpo completo"),
    CARDIO("Cardiovascular");

    private final String displayName;

    MuscleGroup(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}