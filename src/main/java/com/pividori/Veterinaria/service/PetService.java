package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService implements IPetService{

    @Autowired
    private IPetRepository petRepository;

}
