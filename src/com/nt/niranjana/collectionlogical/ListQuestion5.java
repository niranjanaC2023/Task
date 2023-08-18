/*
Implement a Java program that computes the intersection of two ArrayLists of integers. The 
intersection should contain only distinct elements.
*/
package com.nt.niranjana.collectionlogical;

import java.util.ArrayList;
import java.util.List;

public class ListQuestion5 
{
	public static void main(String[] args) 
	{
		
		List<String> firstArrayList = new ArrayList<>();
		firstArrayList.add("abc");
		firstArrayList.add("cde");
		firstArrayList.add("fgh");
		firstArrayList.add("ijk");
		System.out.println("First ArrayList: "+firstArrayList);
		
		List<String> secondArrayList = new ArrayList<>();
		secondArrayList.add("abc");
		secondArrayList.add("dfg");
		secondArrayList.add("fgh");
		secondArrayList.add("ijk");
		System.out.println("Second ArrayList: "+secondArrayList);
		
		firstArrayList.retainAll(secondArrayList);
		System.out.println("Common Data: "+ firstArrayList);
		
	}
}
