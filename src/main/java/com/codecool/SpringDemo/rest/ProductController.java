package com.codecool.SpringDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products") // instead of over all method @GetMapping("/products/{id}")
class ProductController {

    private final AService service;

    @Autowired
    ProductController(@Qualifier("productService") AService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductDTO> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProductDTO get(@PathVariable long id){
        return service.get(id);
    }

    @PostMapping()
    public ProductDTO create(@RequestBody ProductDTO product){
        return service.create(product);
    }

    @PutMapping("/{id}")
    public ProductDTO updateOrCreate(@PathVariable long id, @RequestBody ProductDTO product){
        return service.createOrUpdate(id, product);
    }

    @PatchMapping("/{id}")
    public ProductDTO update(@PathVariable long id, @RequestBody ProductDTO product){
        return service.update(id, product);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        service.delete(id);
    }

}
