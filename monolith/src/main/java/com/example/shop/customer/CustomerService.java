package com.example.shop.customer;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService {

    private final CustomerRepository repo;

    public CustomerService(CustomerRepository r) {
        this.repo = r;
    }

    public Customer create(Customer c) {
        return repo.save(c);
    }

    public List<Customer> all() {
        return repo.findAll();
    }
}
