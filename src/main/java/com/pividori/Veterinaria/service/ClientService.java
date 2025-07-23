package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.repository.IClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClientService implements IClientService{

    private final IClientRepository clientRepository;

}
