package com.nt.niranjana.question3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
	
	String title;
	String author;
	long isbn;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public Book(String title, String author, long isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
