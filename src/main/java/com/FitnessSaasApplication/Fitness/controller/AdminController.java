package com.FitnessSaasApplication.Fitness.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    // Ejemplo de endpoint para verificar acceso de administrador
    @GetMapping("/status")
    public String adminStatus() {
        return "Admin controller activo";
    }

    // Agrega aquí métodos para gestionar usuarios, roles, estadísticas, etc.
}