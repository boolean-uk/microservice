package com.example.shop.product;
import jakarta.persistence.*;

@Entity
public class Product {
    @Id @GeneratedValue private Long id;
    private String name;
    private double price;
    public Product(){}
    public Product(String n,double p){name=n;price=p;}
}
