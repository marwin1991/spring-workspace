package com.codecool.SpringDemo.scopes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component //@Repository, @Service, @Controller, @RestController
//@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@SessionScope // spring session ?
public class ProductHandler {

    private String a;

    @PostConstruct
    public void init(){
        log.info("Utworzono");
    }


    public void test(String a){
        this.a = a;
        log.info("Test");
    }

    @PreDestroy
    public void preDestroy(){
        log.info("Koniec");
    }
}
