package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService{

    @Autowired
    IClientRepository clientRepository;

}
