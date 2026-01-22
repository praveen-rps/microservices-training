package com.example.spring.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.jpa.entity.Book;

@Repository("bookJpa")
public interface BookJpaDao extends JpaRepository<Book,Integer>{
	public List<Book> findByName(String name);
	public List<Book> findByAuthor(String author);
}
