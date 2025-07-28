package com.pividori.Veterinaria.repository;

import com.pividori.Veterinaria.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITokenRepository extends JpaRepository<Token, Long> {
}
