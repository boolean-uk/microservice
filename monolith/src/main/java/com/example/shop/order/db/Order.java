package com.example.shop.order.db;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "shop_order")
@Data
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    private Long customerId;
    private Long productId;
    private int quantity;

}
