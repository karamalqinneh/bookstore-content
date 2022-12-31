package com.project.bookstore.controllers;

import com.project.bookstore.documents.Customer;
import com.project.bookstore.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CustomerController {

  public CustomerService customerService;

  @PostMapping("/customer")
  public boolean createCustomer(@RequestBody Customer customer) {
    boolean response = customerService.createCustomer(customer);

    return response;
  }

  @GetMapping("/customer")
  public List<Customer> getAllCustomers() {
    return customerService.getAllCustomers();
  }
}
