package com.example.shop.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository r) {
        this.repo = r;
    }

    public Product create(Product p) {
        return repo.save(p);
    }

    public List<Product> all() {
        return repo.findAll();
    }
}
