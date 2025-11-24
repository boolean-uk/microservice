package com.example.shop.order;
import jakarta.persistence.*;

@Entity(name="shop_order")
public class OrderEntity {
    @Id @GeneratedValue private Long id;
    private Long customerId;
    private Long productId;
    private int quantity;

    public OrderEntity(){}
    public OrderEntity(Long c,Long p,int q){customerId=c;productId=p;quantity=q;}
}
