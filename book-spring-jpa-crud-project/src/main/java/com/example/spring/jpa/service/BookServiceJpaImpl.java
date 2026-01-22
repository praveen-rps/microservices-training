package com.example.spring.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.spring.jpa.dao.BookJpaDao;
import com.example.spring.jpa.entity.Book;


@Service("Jpa")
public class BookServiceJpaImpl implements BookService {
	
	@Autowired
	//@Qualifier("bookJpa")
	BookJpaDao bookJpaDao;

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		bookJpaDao.save(book);
		return true;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookJpaDao.findAll();
	}

	@Override
	public List<Book> findBookByName(String name) {
		// TODO Auto-generated method stub
		return bookJpaDao.findByName(name);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookJpaDao.save(book);
	}

	@Override
	public List<Book> findBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookJpaDao.findByAuthor(author);
	}

}
