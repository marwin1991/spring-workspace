package com.codecool.SpringDemo.scopes;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    private final Gson gson;
    private final SomeProductRepository someProductRepository;

    @Autowired
    public SimpleService(Gson gson, SomeProductRepository someProductRepository) {
        this.gson = gson;
        this.someProductRepository = someProductRepository;
    }



}
