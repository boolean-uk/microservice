package com.example.shop.order;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repo;

    public OrderService(OrderRepository r) {
        this.repo = r;
    }

    public OrderEntity create(OrderEntity o) {
        return repo.save(o);
    }

    public List<OrderEntity> all() {
        return repo.findAll();
    }
}
