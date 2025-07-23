package com.pividori.Veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pividori.Veterinaria.models.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {
}
