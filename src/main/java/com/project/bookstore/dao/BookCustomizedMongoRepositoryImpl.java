package com.project.bookstore.dao;

import com.project.bookstore.documents.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Optional;

public class BookCustomizedMongoRepositoryImpl<T, ID> implements BookCustomizedMongoRepository <T, ID> {

  @Autowired
  private MongoTemplate mongoTemplate;

  public Optional<Book> findById(ID givenId) {
    Query query = Query.query(Criteria.where("id").is(givenId));
    List<Book> queryResult = mongoTemplate.find(query, Book.class);
    Optional<Book> book= Optional.of(queryResult.get(0));
    return book;
  }
}