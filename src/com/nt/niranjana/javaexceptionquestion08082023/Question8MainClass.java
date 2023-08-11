package com.nt.niranjana.javaexceptionquestion08082023;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Question8MainClass
{

    public static List<Integer> acceptListOfNumberFromuser()
    {
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter integer number only:");
    	
    	List<Integer> addList = new ArrayList<>();
    	while(true)
    	{
    		try
    		{
    			int numbers = scn.nextInt();
        		addList.add(numbers);
        		
    		}		
    		catch(InputMismatchException ime)
    		{
    			System.out.println("Might You pass Non-integer value,Please pass integer value only");
    			break;      //must use , else infinite occur
    		}
    		
    	}
    	System.out.println("Total List Of Number: "+addList);
    	return addList;
    }
    
    public static int calculateSum(List<Integer> numbers) 
    {
        int sum = 0;
        for (int num : numbers) 
        {
            sum = sum+num;  
        }
        System.out.println("Total Sum: "+sum);
        return sum;
    }
    
    public static void main(String[] args) 
    {
    	List<Integer> listOfNum= acceptListOfNumberFromuser();
    	calculateSum(listOfNum);
	}      
}
