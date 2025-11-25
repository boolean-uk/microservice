package com.example.shop.product;

import com.example.shop.product.db.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public Product create(Product product) {
        return productRepository.save(product);
    }

    public List<Product> all() {
        return productRepository.findAll();
    }
}
