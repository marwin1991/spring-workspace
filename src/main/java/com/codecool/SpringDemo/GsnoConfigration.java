package com.codecool.SpringDemo;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsnoConfigration {

    @Bean
    public Gson gson(){
        return new Gson();
    }
}
