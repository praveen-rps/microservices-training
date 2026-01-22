package com.example.spring.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Author {
	
	@Id
	int id;
	String name;
	String genre;

}
