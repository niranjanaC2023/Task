package com.nt.niranjana.javaexceptionquestion08082023;

public class Question10MainClass 
{

	public static int generateRandomNumber() throws Question10CustomHighNumberException
	{
		int randomNumber = (int) (Math.random()*100+1);
		System.out.println("Generate Random Number is: "+randomNumber);
		
		if(randomNumber>80)
		{
			throw new Question10CustomHighNumberException("Generate Random Number is Greater than 80 digit");
		}
		return randomNumber;
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			generateRandomNumber();
		} 
		catch (Question10CustomHighNumberException hne) 
		{
			System.out.println("Question10CustomHighNumberException is: "+hne.getMessage());
		}
	}
	
}
