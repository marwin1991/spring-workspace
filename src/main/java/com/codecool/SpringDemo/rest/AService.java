package com.codecool.SpringDemo.rest;

import java.util.List;

public interface AService {
    List<ProductDTO> getAll();

    ProductDTO get(long id);

    ProductDTO create(ProductDTO product);

    ProductDTO createOrUpdate(long id, ProductDTO product);

    ProductDTO update(long id, ProductDTO product);

    void delete(long id);
}
