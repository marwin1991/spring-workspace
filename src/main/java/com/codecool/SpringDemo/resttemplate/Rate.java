package com.codecool.SpringDemo.resttemplate;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Rate {
    private String currency;
    private String code;
    private Double mid;
}