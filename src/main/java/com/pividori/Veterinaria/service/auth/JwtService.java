package com.pividori.Veterinaria.service.auth;

import com.pividori.Veterinaria.models.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.Map;

@Service
public class JwtService {

        @Value("${application.security.jwt.secret-key}")
        private String secretKey;
        @Value("${application.security.jwt.expiration}")
        private Long jwtExpiration;
        @Value("${application.security.jwt.refresh-token.expiration}")
        private Long refreshExpiration;

    public String generateToken(final User user){
        return buildToken(user, jwtExpiration);
    }

    public String generateRefreshToken(final User user){
        return buildToken(user, refreshExpiration);
    }

    private String buildToken(final User user, final Long expiration) {
        return Jwts.builder()
                .setId(user.getId().toString())
                .setClaims(Map.of("name", user.getName(), "lastname", user.getLastname()))
                .setSubject(user.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(getSignInKey())
                .compact();
    }

    private SecretKey getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
