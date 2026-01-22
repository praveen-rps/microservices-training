package com.example.spring.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.jpa.dao.BookDao;
import com.example.spring.jpa.entity.Book;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDao bookDao;

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDao.getAllBooks();
	}

	@Override
	public List<Book> findBookByName(String name) {
		// TODO Auto-generated method stub
		return bookDao.findBookByName(name);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(book);
	}

	@Override
	public List<Book> findBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
