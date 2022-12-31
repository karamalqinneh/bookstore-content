package com.project.bookstore.documents;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Book {
  @Id
  private String id;
  private String name;
  private String author;
  private float price;
  private List<Sale> sales;

  @Override
  public String toString() {
    return "Book{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            ", sales=" + sales +
            '}';
  }
}
