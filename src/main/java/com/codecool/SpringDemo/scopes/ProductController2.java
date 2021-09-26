package com.codecool.SpringDemo.scopes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController2 {

    private String name;

    private final SomeProductService someProductService;

    public ProductController2(SomeProductService someProductService){
        this.someProductService = someProductService;
        log.info("Utworzono obiekt");
    }


    @GetMapping("/ping2")
    public String ping(){
        return "pong";
    }
}
