package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

}
