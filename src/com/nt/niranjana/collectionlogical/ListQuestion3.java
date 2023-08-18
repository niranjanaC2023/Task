/*
Create a Java program that takes two ArrayLists of strings as input and returns a new ArrayList 
containing strings that are present in the first list but not in the second list.
*/
package com.nt.niranjana.collectionlogical;

import java.util.ArrayList;
import java.util.List;

public class ListQuestion3 
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
		secondArrayList.add("rty");
		System.out.println("Second ArrayList: "+secondArrayList);
		
		List<String> thirdArrayList = new ArrayList<>();
		
		//thirdArrayList.addAll(firstArrayList);
		//System.out.println("Both are "+thirdArrayList);
		
		
		for(String firstArrayStringData : firstArrayList)
		{
			if(!secondArrayList.contains(firstArrayStringData))
			{
				thirdArrayList.add(firstArrayStringData);
			}
		}
		System.out.println(thirdArrayList);
		
		
		
		

	}
	
}
