package com.pividori.Veterinaria.repository;

import com.pividori.Veterinaria.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Long> {
}
