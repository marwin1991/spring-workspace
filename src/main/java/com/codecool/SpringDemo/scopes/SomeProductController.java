package com.codecool.SpringDemo.scopes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Lazy
@Slf4j
@RestController
public class SomeProductController {

    private String name;

    private final SomeProductService someProductService;

    private final ProductHandler handler;

    public SomeProductController(SomeProductService someProductService, ProductHandler handler){
        this.someProductService = someProductService;
        this.handler = handler;
        log.info("Utworzono obiekt");
    }


    @GetMapping("/ping")
    public String ping(){
        handler.test("Ala ma kota");
        return "pong";
    }
}
