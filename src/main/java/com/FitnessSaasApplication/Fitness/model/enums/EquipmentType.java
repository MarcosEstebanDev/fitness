package com.FitnessSaasApplication.Fitness.model.enums;

public enum EquipmentType {
    BODYWEIGHT("Peso corporal"),
    DUMBBELLS("Mancuernas"),
    BARBELL("Barra"),
    MACHINE("Máquina"),
    CABLES("Poleas"),
    RESISTANCE_BAND("Banda elástica"),
    KETTLEBELL("Kettlebell"),
    MEDICINE_BALL("Pelota medicinal"),
    SUSPENSION("Suspensión (TRX)"),
    SMITH_MACHINE("Máquina Smith"),
    FREE_WEIGHTS("Pesos libres");

    private final String displayName;

    EquipmentType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}