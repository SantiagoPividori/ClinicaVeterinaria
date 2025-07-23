package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private IEmployeeRepository employeeRepository;

}
