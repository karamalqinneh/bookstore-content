package com.project.bookstore.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Customer {
  @Id
  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private List<Sale> purchases;
}
