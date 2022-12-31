package com.project.bookstore.services;

import com.project.bookstore.dao.BookDAO;
import com.project.bookstore.documents.Book;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookService {
  private final BookDAO bookDAO;
  public void addBook(Book book) {
     bookDAO.insert(book);
  }
}
