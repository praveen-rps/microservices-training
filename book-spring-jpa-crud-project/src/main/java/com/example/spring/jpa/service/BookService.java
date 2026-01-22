package com.example.spring.jpa.service;

import java.util.List;

import com.example.spring.jpa.entity.Book;

public interface BookService {
	
	public boolean addBook(Book book);
	public List<Book> getAllBooks();
	public List<Book> findBookByName(String name);
	public Book updateBook(Book book);
	public List<Book> findBooksByAuthor(String author);

}
