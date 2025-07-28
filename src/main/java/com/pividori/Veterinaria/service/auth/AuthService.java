package com.pividori.Veterinaria.service.auth;

import com.pividori.Veterinaria.dtos.AuthenticateRequest;
import com.pividori.Veterinaria.dtos.AuthenticateResponse;
import com.pividori.Veterinaria.dtos.RegisterRequest;
import com.pividori.Veterinaria.models.Token;
import com.pividori.Veterinaria.models.User;
import com.pividori.Veterinaria.repository.ITokenRepository;
import com.pividori.Veterinaria.repository.IUserRepository;
import com.pividori.Veterinaria.util.TokenType;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService implements IAuthService {

    private final IUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final ITokenRepository tokenRepository;
    //private final AuthenticationManager authenticationManager;

    public AuthenticateResponse register(RegisterRequest registerRequest) {
        var user = User.builder()
                .username(registerRequest.username())
                .password(passwordEncoder.encode(registerRequest.password()))
                .name(registerRequest.name())
                .build();
        var saveUser = userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefreshToken(user);
        saveUserToken(user, jwtToken);
        return new AuthenticateResponse(jwtToken, refreshToken);
    }

    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest) {
        return null;
    }

    private void saveUserToken(User user, String jwtToken) {
        var token = Token.builder()
                .user(user)
                .token(jwtToken)
                .tokenType(TokenType.BEARER)
                .expired(false)
                .revoked(false)
                .build();
        tokenRepository.save(token);
    }


}
