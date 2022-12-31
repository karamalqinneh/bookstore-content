package com.project.bookstore.utils.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class BookException extends RuntimeException{
  public BookException(String message) {
    super(message);
  }
}
