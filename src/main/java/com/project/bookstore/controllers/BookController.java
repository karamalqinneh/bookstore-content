package com.project.bookstore.controllers;

import com.project.bookstore.documents.Book;
import com.project.bookstore.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class BookController {

  private BookService bookService;

  @PostMapping("/add/book")
  public Book addBook(@RequestBody Book book) {
    bookService.addBook(book);

    return book;
  }

  @GetMapping("/test")
  public String hello() {
    return "UP AND RUNNING";
  }

  @GetMapping("/books")
  public List<Book> getAllBooks() {
    return bookService.getAllBooks();
  }

  @GetMapping("/book/{id}")
  public Book getSingleBook(@PathVariable String id) {
    return bookService.getById(id);
  }

  @GetMapping("/book/name/{name}")
  public Book getSingleBookByName(@PathVariable String name) {
    return bookService.getByName(name);
  }
}
