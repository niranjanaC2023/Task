/*
Implement a Java function that finds the kth smallest element in an ArrayList of integers.
*/
package com.nt.niranjana.collectionlogical;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListQuestion2 
{
	public static void main(String[] args) 
	{
		
		List<Integer> listOfInteger = new ArrayList<>();
		listOfInteger.add(21);
		listOfInteger.add(10);
		listOfInteger.add(27);
		listOfInteger.add(12);
		System.out.println("Total Integer Value: "+listOfInteger);
		
		//Integer smallestNum = listOfInteger.stream().min((x,y)->x.compareTo(y)).get();
		//System.out.println("Smallest number is:"+smallestNum);
		
		//int minIndex = listOfInteger.indexOf(Collections.min(listOfInteger));
		//System.out.println("Index of minimum value: " + minIndex);
		
		int secondSmallestNumber = listOfInteger.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();		
		System.out.println("\nSecond Smallest number in List is: "+ secondSmallestNumber);
	}
	
}
