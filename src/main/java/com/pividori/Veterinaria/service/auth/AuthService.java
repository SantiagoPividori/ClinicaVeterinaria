package com.pividori.Veterinaria.service.auth;

import com.pividori.Veterinaria.dtos.AuthenticateRequest;
import com.pividori.Veterinaria.dtos.AuthenticateResponse;
import com.pividori.Veterinaria.dtos.RegisterRequest;
import com.pividori.Veterinaria.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService implements IAuthService {

    private final IUserRepository employeeRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Override
    public AuthenticateResponse register(RegisterRequest registerRequest) {
        return null;
    }

    @Override
    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest) {
        return null;
    }
}
