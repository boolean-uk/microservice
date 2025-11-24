package com.example.shop.customer;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService svc;
    public CustomerController(CustomerService s){this.svc=s;}

    @PostMapping public Customer create(@RequestBody Customer c){return svc.create(c);}
    @GetMapping public List<Customer> all(){return svc.all();}
}
