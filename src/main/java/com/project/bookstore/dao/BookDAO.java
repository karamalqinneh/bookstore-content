package com.project.bookstore.dao;

import com.project.bookstore.documents.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookDAO extends MongoRepository<Book, String> {
}
