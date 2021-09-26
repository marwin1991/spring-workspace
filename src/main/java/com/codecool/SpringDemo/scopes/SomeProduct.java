package com.codecool.SpringDemo.scopes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SomeProduct {

    @Id
    private Long id;

    private String name;
    private BigDecimal price;

}
