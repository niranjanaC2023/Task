/*
Create a Java function that partitions an ArrayList of integers into two sublists, one containing even 
numbers and the other containing odd numbers, while maintaining their relative order.
*/
package com.nt.niranjana.collectionlogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListQuestion6 
{
	public static void main(String[] args) 
	{
		
		List<Integer> intLists = Arrays.asList(3,4,2,5,6,7,4,5);
		
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		
		for(Integer intNum : intLists)
		{
			if(intNum % 2 == 0)
			{
				evenList.add(intNum);
			}
			else
			{
				oddList.add(intNum);
			}
		}
		System.out.println("Even List: "+evenList);
		System.out.println("Odd List: "+oddList);
		
		
		//using stream concept
		List<Integer> evenNumber = intLists.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even Number: "+evenNumber);
		
		List<Integer> oddNumber = intLists.stream().filter(i->i%2==1).collect(Collectors.toList());
		System.out.println("Odd Number: "+oddNumber);
		
		//using stream advanced concept
		Map<Boolean, List<Integer>> partitions = intLists.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
		List<Integer> evens = partitions.get(true);
		List<Integer> odds = partitions.get(false);
		System.out.println("evens: "+evens);
		System.out.println("odds: "+odds);
	}
}
