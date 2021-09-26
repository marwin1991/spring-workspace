package com.codecool.SpringDemo.rest;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BProductService implements AService {
    public List<ProductDTO> getAll() {
        return Collections.emptyList();
    }

    public ProductDTO get(long id) {
        return new ProductDTO();
    }

    public ProductDTO create(ProductDTO product) {
        return new ProductDTO();
    }

    public ProductDTO createOrUpdate(long id, ProductDTO product) {
        return new ProductDTO();
    }

    public ProductDTO update(long id, ProductDTO product) {
        return new ProductDTO();
    }

    @Override
    public void delete(long id) {

    }
}
