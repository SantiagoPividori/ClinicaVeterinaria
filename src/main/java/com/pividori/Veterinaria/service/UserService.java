package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.repository.IUserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService implements IUserService {

    private final IUserRepository userRepository;

}
