package com.pividori.Veterinaria.dtos;


public record AuthenticateRequest (
        String username,
        String password
){
}
