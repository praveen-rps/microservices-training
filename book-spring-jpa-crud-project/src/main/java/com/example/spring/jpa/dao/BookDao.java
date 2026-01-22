package com.example.spring.jpa.dao;

import java.util.List;

import com.example.spring.jpa.entity.Book;

public interface BookDao {
	
	public boolean addBook(Book book);
	public List<Book> getAllBooks();
	public List<Book> findBookByName(String name);
	public Book updateBook(Book book);


}
