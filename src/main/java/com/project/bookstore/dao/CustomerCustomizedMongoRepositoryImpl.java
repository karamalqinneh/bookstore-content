package com.project.bookstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class CustomerCustomizedMongoRepositoryImpl <T, ID> implements CustomerCustomizedMongoRepository <T, ID>{

  @Autowired
  private MongoTemplate mongoTemplate;
}
