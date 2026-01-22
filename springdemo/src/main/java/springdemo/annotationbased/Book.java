package springdemo.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
	
	int isbn;
	String name;
	@Autowired
	Author author;
	
	public Book() {
		this.isbn=1001;
		this.name="springboot";
		
	}
	
	public Book(int isbn, String name, Author author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	//@Autowired
	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", author=" + author + "]";
	}
	

}
