package com.project.bookstore.services;

import com.project.bookstore.dao.BookDAO;
import com.project.bookstore.documents.Book;
import com.project.bookstore.utils.exceptions.BookException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BookService {
  private final BookDAO bookDAO;
  public Book addBook(Book book) {
    Book result = bookDAO.insert(book);
    if(result == null) throw new BookException("failed to add");
    return result;
  }

  public Book getById(String id) throws BookException {
    Book result;
    Optional<Book> queryResult = bookDAO.findById(id);
    if(queryResult.isPresent()) {
      result = queryResult.get();
    } else {
      throw new BookException("no book with this id");
    }

    return result;
  }

  public Book getByName(String name) {
    return bookDAO.findByName(name);
  }

  public List<Book> getAllBooks() {
    return bookDAO.findAll();
  }

  public List<Book> cheaperThan(int price) {
    return bookDAO.findByPrice(price);
  }
}
