package com.nt.niranjana.javaexceptionquestion08082023;

public class Question7ChainedExceptionMainClass
{

	public static void exceptionInsideMethod()
	{
		try
		{
			throw new Question7CustomException("You are generated custom exception");
		}
		catch(Question7CustomException e)
		{
			throw new Question7CustomRunTimeException("You are generated custom runtime exception");
		}
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			exceptionInsideMethod();
        } 
		catch (RuntimeException e) 
		{
            System.out.println("Caught RuntimeException: " + e.getMessage());
            if (e.getCause() != null) 
            {
                System.out.println("Caused by: " + e.getCause().getMessage());
            }
        }
		
	}
}
