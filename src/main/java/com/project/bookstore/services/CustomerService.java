package com.project.bookstore.services;

import com.project.bookstore.dao.CustomerDAO;
import com.project.bookstore.documents.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerService {

  public CustomerDAO customerDAO;

  public boolean createCustomer(Customer customer) {
    Customer result = customerDAO.insert(customer);
    if (result == null) {
      return false;
    }
    return true;
  }

  public List<Customer> getAllCustomers() {
    return customerDAO.findAll();
  }
}
