package com.nt.niranjana.javaOops04082023;

import java.util.UUID;

public class LibraryItemMainClass
{

	public static void main(String[] args) 
	{
		LibraryItem lib = new LibraryItem();
		lib.setId(UUID.randomUUID().toString());
		lib.setTitle("400 Days");
		lib.setAuthor("Chetan Bhagat");
		lib.display();
		System.out.println();
		
		Book book = new Book();
		book.setId(UUID.randomUUID().toString());
		book.setTitle("The India Story");
		book.setAuthor("Bimal Janan");
		book.display();
		System.out.println();
		
		DVD dvd = new DVD();
		dvd.setId(UUID.randomUUID().toString());
		dvd.setTitle("Odisha Itihaas");
		dvd.setAuthor("Dr.Harekrshna Mohatab");
		dvd.display();
		
	}
}
