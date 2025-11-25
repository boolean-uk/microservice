package com.example.shop.order;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService svc;

    public OrderController(OrderService s) {
        this.svc = s;
    }

    @PostMapping
    public OrderEntity create(@RequestBody OrderEntity o) {
        return svc.create(o);
    }

    @GetMapping
    public List<OrderEntity> all() {
        return svc.all();
    }
}
