package com.nt.niranjana.javaexceptionquestion08082023;

public class Question4Mainclass 
{
	
	public static void calculateAverage(int[] listOfNumber) throws Question4CustomNoDataException
	{
		int totalSum=0;
		double average=0;
		if(listOfNumber == null || listOfNumber.length==0)
		{
			throw new Question4CustomNoDataException("You are passing empty array, Array is Empty");
		}
		for(int num : listOfNumber)
		{
			System.out.println(num);
			totalSum = totalSum+num;
			
		}
		System.out.println("Total Sum is: "+totalSum);
		System.out.println("length is: "+listOfNumber.length);
		average = totalSum/listOfNumber.length;
		System.out.println("Average is: "+average);
	}
	public static void main(String[] args) 
	{
		int[] num = {};
		try 
		{
			calculateAverage(num);
		}
		catch (Question4CustomNoDataException e) 
		{
			e.printStackTrace();
		}
	}

}
