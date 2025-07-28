package com.pividori.Veterinaria.dtos;

public record RegisterRequest(
        String username,
        String password,
        String name
) {
}
