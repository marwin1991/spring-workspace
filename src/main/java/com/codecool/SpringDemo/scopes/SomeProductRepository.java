package com.codecool.SpringDemo.scopes;

import org.springframework.data.repository.CrudRepository;

public interface SomeProductRepository extends CrudRepository<SomeProduct, Long> {
}
