package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.repository.IPetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PetService implements IPetService{

    private final IPetRepository petRepository;

}
