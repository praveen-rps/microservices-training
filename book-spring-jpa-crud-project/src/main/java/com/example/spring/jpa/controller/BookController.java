package com.example.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.jpa.entity.Book;
import com.example.spring.jpa.service.BookServiceJpaImpl;

@RestController
public class BookController {
	
	@Autowired
//	@Qualifier("jpa")
	BookServiceJpaImpl service;
	
	@GetMapping("/api/author/{name}")
	public List<Book> findBooksByAuthor(@PathVariable String name)
	{
		return service.findBooksByAuthor(name);
	}
	
	@GetMapping("/api/books")
	@ResponseStatus(HttpStatus.OK)
	public List<Book> getBooks(){
		return service.getAllBooks();
	}
	
	@PostMapping("/api/books")
	@ResponseStatus(HttpStatus.CREATED)
	public String addBook(@RequestBody Book book) {
		
		if(service.addBook(book))
			return "Book Added successfully";
		else
			return "book not added";
	}
	
	@PutMapping("/api/books")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Book updateBooks(@RequestBody Book book) {
		return service.updateBook(book);
	}
	
	@GetMapping("api/books/search/{name}")
	public List<Book> getBooksByName(@PathVariable String name){
		
		return service.findBookByName(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
