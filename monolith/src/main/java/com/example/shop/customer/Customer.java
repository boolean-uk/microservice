package com.example.shop.customer;
import jakarta.persistence.*;

@Entity
public class Customer {
    @Id @GeneratedValue private Long id;
    private String name;
    private String email;

    public Customer(){}
    public Customer(String n,String e){name=n;email=e;}
    public Long getId(){return id;}
    public String getName(){return name;}
    public String getEmail(){return email;}
}
