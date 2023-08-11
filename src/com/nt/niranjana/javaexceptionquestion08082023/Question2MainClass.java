package com.nt.niranjana.javaexceptionquestion08082023;

import java.util.Scanner;

public class Question2MainClass
{
	
	public static  void division(int input1,int input2)
	{
		double result;
		System.out.println("Division Method");
		try 
		{
			result = input1/input2;
			System.out.println("result: "+result);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) 
	{
		int firstNumber; 
		int secondNumber;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first number:");
		firstNumber = scn.nextInt();
		System.out.println("enter second number:");
		secondNumber = scn.nextInt();
		
		division(firstNumber, secondNumber);
	}

}
