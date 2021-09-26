package com.codecool.SpringDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Lazy
@Slf4j
@RestController
public class ProductController {

    private String name;

    private final ProductService productService;

    private final ProductHandler handler;

    public ProductController(ProductService productService, ProductHandler handler){
        this.productService = productService;
        this.handler = handler;
        log.info("Utworzono obiekt");
    }


    @GetMapping("/ping")
    public String ping(){
        handler.test("Ala ma kota");
        return "pong";
    }
}
