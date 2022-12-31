package com.project.bookstore.dao;

import com.project.bookstore.documents.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerDAO extends MongoRepository<Customer, String>, CustomerCustomizedMongoRepository<Customer, String> {
}
