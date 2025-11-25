package com.example.shop.order;

import com.example.shop.order.db.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order create(@RequestBody Order orderEntity) {
        return orderService.create(orderEntity);
    }

    @GetMapping
    public List<Order> all() {
        return orderService.all();
    }
}
