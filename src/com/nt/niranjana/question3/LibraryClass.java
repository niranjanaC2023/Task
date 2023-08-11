package com.nt.niranjana.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryClass {

	public List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	} 
	
	
	public static void main(String[] args) 
	{
		
		
		Book book1 = new Book("The India Story","Bimal Janan",98989998);
		Book book2 = new Book("Odisha Itihaas","Dr.Harekrshna Mohatab",64289998);
		Book book3 = new Book("400 Days","Chetan Bhagat",980287998);
		Book book4 = new Book("The End Game","Hussain Zaidi",98085998);
		
		List<Book> listOfBook = new ArrayList<>();
		listOfBook.add(book1);
		listOfBook.add(book2);
		listOfBook.add(book3);
		listOfBook.add(book4);
		
		System.out.println(listOfBook);
		System.out.println();
		
		for(Book book : listOfBook)
		{
			System.out.println(book);
		}
		System.out.println();
		
		
		String title = listOfBook.get(0).getTitle();
		System.out.println("Book Title is: "+title);
		
		String auth = listOfBook.get(0).getAuthor();
		System.out.println("Book author is: "+auth);
		System.err.println();

		/*
		 * HashMap<String,String> mk = new HashMap<>();
		 * mk.put("Bimal Janan",listOfBook.get(0).getTitle());
		 * mk.put("Dr.Harekrshna Mohatab",listOfBook.get(1).getTitle());
		 * mk.put("Chetan Bhagat",listOfBook.get(2).getTitle());
		 * mk.put("Hussain Zaidi",listOfBook.get(3).getTitle());
		 * System.out.println("All Mapped data: "+mk); System.out.println();
		 * 
		 * //get the book using its title for(String book : mk.values()) {
		 * System.out.println(book); }
		 */
		System.err.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Author Name: ");
		
		String authorr;
		authorr = scn.nextLine();
		
		if(authorr.equals("Bimal Janan"))
		{
			System.out.println("Book is: "+listOfBook.get(0).getTitle());
		}
		else if(authorr.equals("Dr.Harekrshna Mohatab"))
		{
			System.out.println("Book is: "+listOfBook.get(1).getTitle());
		}
		else if(authorr.equals("Chetan Bhagat"))
		{
			System.out.println("Book is: "+listOfBook.get(2).getTitle());
		}
		else if(authorr.equals("Hussain Zaidi"))
		{
			System.out.println("Book is: "+listOfBook.get(3).getTitle());
		}
		else
		{
			System.out.println("No Data Found");
		}
		
	}
	
}
