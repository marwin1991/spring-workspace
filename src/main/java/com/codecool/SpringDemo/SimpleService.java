package com.codecool.SpringDemo;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    private final Gson gson;
    private final ProductRepository productRepository;

    @Autowired
    public SimpleService(Gson gson, ProductRepository productRepository) {
        this.gson = gson;
        this.productRepository = productRepository;
    }



}
