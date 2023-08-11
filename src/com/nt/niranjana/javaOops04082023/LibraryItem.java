package com.nt.niranjana.javaOops04082023;

public class LibraryItem 
{

	 String title;
	String author;
	String id;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LibraryItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LibraryItem [title=" + title + ", author=" + author + ", id=" + id + "]";
	}
	
	public void display()
	{
		System.out.println("Title is: "+title);
		System.out.println("Author is: "+author);
		System.out.println("Unique ID is: "+id);
	}
	
}
