package com.codecool.SpringDemo.resttemplate;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class Root {
    private String table;
    private String no;
    private String effectiveDate;
    private List<Rate> rates = new ArrayList<>();
}