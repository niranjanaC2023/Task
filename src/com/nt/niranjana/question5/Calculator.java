package com.nt.niranjana.question5;

public class Calculator 
{
	double firstNumber;
	double secondNumber;
	double result;
	
	public void addition(double firstNumber,double secondNumber)
	{
		result=firstNumber+secondNumber;
		System.out.println(result);
	}
	
	public void substraction(double firstNumber,double secondNumber)
	{
		result=firstNumber-secondNumber;
		System.out.println(result);
	}
	
	public void multiplication(double firstNumber,double secondNumber)
	{
		result=firstNumber*secondNumber;
		System.out.println(result);
	}
	
	public void division(double firstNumber,double secondNumber)
	{
		result=firstNumber/secondNumber;
		System.out.println(result);
	}

	public Calculator(double firstNumber, double secondNumber, double result) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.result = result;
	}

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

}
