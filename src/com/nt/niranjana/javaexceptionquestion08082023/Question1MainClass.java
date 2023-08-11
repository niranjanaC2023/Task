package com.nt.niranjana.javaexceptionquestion08082023;

import java.util.Scanner;

public class Question1MainClass
{
	public static void main(String[] args) 
	{
		String userInput;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter Input:");
		userInput = scn.nextLine();
		try 
		{
			Integer.parseInt(userInput);
			System.out.println(userInput+" Is a valid integer");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Number Format Exception:"+userInput+" Is not a valid integer");
		}
		finally 
		{
			scn.close();
		}
		
	}
}
