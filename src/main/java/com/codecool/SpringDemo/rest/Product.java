package com.codecool.SpringDemo.rest;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Product {
    @Id
    private long id;
    private String name;
    private String description;
    private BigDecimal price;

}
