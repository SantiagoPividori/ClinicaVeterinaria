package com.pividori.Veterinaria.service.auth;

import com.pividori.Veterinaria.dtos.AuthenticateRequest;
import com.pividori.Veterinaria.dtos.AuthenticateResponse;
import com.pividori.Veterinaria.dtos.RegisterRequest;

public interface IAuthService {

    public AuthenticateResponse register(RegisterRequest registerRequest);
    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest);


}
