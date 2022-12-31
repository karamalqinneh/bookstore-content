package com.project.bookstore.controllers;

import com.project.bookstore.documents.Book;
import com.project.bookstore.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class BookController {

  private BookService bookService;

  @PostMapping("/book")
  public Book addBook(@RequestBody Book book) {
    bookService.addBook(book);

    return book;
  }

  @GetMapping("/test")
  public String hello() {
    return "UP AND RUNNING";
  }
}
