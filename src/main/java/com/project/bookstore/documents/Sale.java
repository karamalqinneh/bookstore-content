package com.project.bookstore.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Sale {
  @Id
  private String id;
  private Customer customer;
  private Book book;
  private float amount;
}
