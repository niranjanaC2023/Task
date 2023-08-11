package com.nt.niranjana.javaexceptionquestion08082023;

import java.util.Scanner;

public class Question6MainClass 
{
	public static void convertStringToInt(String input) throws Question6CustomNumberExcepton
	{
		try
		{
			int num = Integer.parseInt(input);
			System.out.println(num+" Is a valid integer");
		}
		catch(NumberFormatException nfe)
		{
			throw new Question6CustomNumberExcepton("String cannot convert to integer, pass integer value");
		}		
	}
	
	public static void main(String[] args) 
	{

		Scanner scn = new Scanner(System.in);
		System.out.println("enter input");
		String user = scn.nextLine();
		try 
		{
			convertStringToInt(user);
		} 
		catch (Question6CustomNumberExcepton e) 
		{
			e.printStackTrace();
		}
	}

}
