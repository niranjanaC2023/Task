/*
Write a Java program that takes a list of integers as input and returns a new list with all the duplicate 
elements removed.
*/
package com.nt.niranjana.collectionlogical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListQuestion1 
{
	public static void main(String[] args) 
	{
		
		List<Integer> listOfInteger = new ArrayList<>();
		listOfInteger.add(10);
		listOfInteger.add(21);
		listOfInteger.add(21);
		listOfInteger.add(10);
		listOfInteger.add(27);
		listOfInteger.add(12);
		System.out.println("Total Integer Value: "+listOfInteger);
		
		Set<Integer> removeDuplicate = new HashSet<>(listOfInteger);
		System.out.println("Removed Duplicates: "+removeDuplicate);
		
		
	}
	
}
