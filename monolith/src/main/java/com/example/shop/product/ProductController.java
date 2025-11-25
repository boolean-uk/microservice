package com.example.shop.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService svc;

    public ProductController(ProductService s) {
        this.svc = s;
    }

    @PostMapping
    public Product create(@RequestBody Product p) {
        return svc.create(p);
    }

    @GetMapping
    public List<Product> all() {
        return svc.all();
    }
}
