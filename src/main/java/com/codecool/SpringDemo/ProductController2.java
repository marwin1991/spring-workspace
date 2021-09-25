package com.codecool.SpringDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController2 {

    private String name;

    private final ProductService productService;

    public ProductController2(ProductService productService){
        this.productService = productService;
        log.info("Utworzono obiekt");
    }


    @GetMapping("/ping2")
    public String ping(){
        return "pong";
    }
}
