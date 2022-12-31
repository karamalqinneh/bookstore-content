package com.project.bookstore.dao;

import com.project.bookstore.documents.Book;

import java.util.List;
import java.util.Optional;

public interface BookCustomizedMongoRepository<T, ID> {

  Optional<Book> findById(ID givenId);
  List<Book> findByPrice(int price);
}
