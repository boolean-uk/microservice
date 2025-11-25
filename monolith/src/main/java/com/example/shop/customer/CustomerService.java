package com.example.shop.customer;

import com.example.shop.customer.db.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
private final RestTemplate restTemplate;

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> all() {
        return customerRepository.findAll();
    }
}
