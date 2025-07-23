package com.pividori.Veterinaria.controllers;

import com.pividori.Veterinaria.dtos.AuthenticateRequest;
import com.pividori.Veterinaria.dtos.AuthenticateResponse;
import com.pividori.Veterinaria.dtos.RegisterRequest;
import com.pividori.Veterinaria.service.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticateResponse> register(@RequestBody RegisterRequest registerRequest){

        return ResponseEntity.ok(service.register(registerRequest));

    }

    @GetMapping("/login")
    public ResponseEntity<AuthenticateResponse> authenticate(@RequestBody AuthenticateRequest authenticateRequest){

        return ResponseEntity.ok(service.authenticate(authenticateRequest));

    }

}
