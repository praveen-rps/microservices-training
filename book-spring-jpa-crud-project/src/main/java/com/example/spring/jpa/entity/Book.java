package com.example.spring.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Table(name="book_tbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	int isbn;
	String author;
	String publisher;
	String name;
	double price; 

}
