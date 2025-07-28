package com.pividori.Veterinaria.controllers;

import com.pividori.Veterinaria.dtos.AuthenticateRequest;
import com.pividori.Veterinaria.dtos.AuthenticateResponse;
import com.pividori.Veterinaria.dtos.RegisterRequest;
import com.pividori.Veterinaria.service.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticateResponse> register(@RequestBody RegisterRequest registerRequest) {
        final AuthenticateResponse response = service.register(registerRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticateResponse> authenticate(@RequestBody AuthenticateRequest authenticateRequest) {
        final AuthenticateResponse response = service.authenticate(authenticateRequest);
        return ResponseEntity.ok(response);
    }

    /*@PostMapping("/refresh")
    public TokenResponse refreshToken(@RequestHeader(HttpHeaders.AUTHORIZATION) final String autHeader){
        return service.refreshToken(autHeader);
    }*/

}
