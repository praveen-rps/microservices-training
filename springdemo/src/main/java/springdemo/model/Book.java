package springdemo.model;

public class Book {
	int isbn;
	String author;
	String name;
	public Book() {
		
	}
	public Book(int isbn, String author, String name) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.name = name;
	}
	public int getIsbn() {
		return isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", name=" + name + "]";
	}
	
	

}
