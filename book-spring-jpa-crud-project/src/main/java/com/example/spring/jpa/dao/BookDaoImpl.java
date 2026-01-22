package com.example.spring.jpa.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.spring.jpa.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
public class BookDaoImpl implements BookDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		
		entityManager.persist(book);
		return true;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from Book", Book.class).getResultList();
	}

	@Override
	public List<Book> findBookByName(String name) {
		// TODO Auto-generated method stub
		
		List<Book> books = entityManager.createQuery("from Book", Book.class).getResultList();
		return books.stream()
		.filter(book -> book.getName().equals(name))
		.collect(Collectors.toList());
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return entityManager.merge(book);
	}

}
