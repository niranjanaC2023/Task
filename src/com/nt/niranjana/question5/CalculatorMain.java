package com.nt.niranjana.question5;

import java.util.Scanner;

public class CalculatorMain {

	public void calculate()
	{
		double firstNumber;
		double secondNumber;
		double userResponse;
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		firstNumber = scn.nextDouble();
		
		System.out.println("Enter Second Number: ");
		secondNumber = scn.nextDouble();
		
		System.out.println("***Math Operations are: ");
		System.out.println("For Addition press 1");
		System.out.println("For Substraction press 2");
		System.out.println("For Multiplication press 3");
		System.out.println("For Division press 4");
		System.out.println("For Exit press 5");
		System.out.println("Choose Your Operation: ");
		userResponse = scn.nextInt();
		
		if(userResponse == 1)
		{
			System.out.println("ADDITION: ");
			calc.addition(firstNumber,secondNumber);
		}
		else if(userResponse == 2)
		{
			System.out.println("SUBSTRACTION :");
			calc.substraction(firstNumber,secondNumber);
		}
		else if(userResponse == 3)
		{
			System.out.println("MULTIPLICATION :");
			calc.multiplication(firstNumber,secondNumber);
		}
		else if(userResponse == 4)
		{
			System.out.println("DIVISION :");
			calc.division(firstNumber,secondNumber);
		}
		else if(userResponse == 5)
		{
			System.out.println("Thank You!!!");
		}
		else 
		{
			System.out.println("please choose valid operation");
		}
	}
	public static void main(String[] args) 
	{
		CalculatorMain main = new CalculatorMain();
		main.calculate();
	}

}
