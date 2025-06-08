package com.FitnessSaasApplication.Fitness.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Aquí deberías validar el usuario y devolver un token o sesión
        return "Login exitoso para usuario: " + username;
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        // Aquí deberías registrar el usuario en la base de datos
        return "Usuario registrado: " + username;
    }
}