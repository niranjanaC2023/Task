/*
Implement a Java function to shuffle the elements of an ArrayList of strings randomly.
*/
package com.nt.niranjana.collectionlogical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListQuestion8
{
	public static void main(String[] args) 
	{
		
		List<String> intLists = Arrays.asList("abc","sks","sjs","lso");
		System.out.println("String List: "+intLists);
		
		Collections.shuffle(intLists);  //randomly generate the given List of string
		System.out.println("String List Randomly: "+intLists);
		
		
	}
}
