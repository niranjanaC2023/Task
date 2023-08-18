/*
Write a Java function that merges two sorted ArrayLists of integers into a single sorted ArrayList.
*/
package com.nt.niranjana.collectionlogical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListQuestion10
{
	public static void main(String[] args) 
	{
		
		List<Integer> intList1 = Arrays.asList(7,12,1,3,45);
		System.out.println("Integer List: "+intList1);
		Collections.sort(intList1);
		System.out.println("Integer1 Sorting: "+intList1);
		
		List<Integer> intList2 = Arrays.asList(17,4,10,5,12,3,67);
		System.out.println("Integer2 List: "+intList2);
		Collections.sort(intList2);
		System.out.println("Integer2 Sorting: "+intList2);
		
		
		
		
		
		
		
	}
}
