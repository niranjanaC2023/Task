package com.nt.niranjana.javaOops04082023;

import java.util.Scanner;

public class ATMMainClass
{
	private double balance = 10000;
	private double amount;
	public void withdrawing(double amount)
	{
		if(amount<balance)
		{
			balance = balance-amount;
			System.out.println("Balance After withdraw: "+balance);
		}
		else
		{
			System.out.println("You don't have sufficient balance to withdraw");
		}
	}
	
	public void depositing(double amount)
	{
		if(amount>0)
		{
			balance = balance+amount;
			System.out.println("Balance After deposit: "+balance);
		}
		else
		{
			System.out.println("enter valid amount");
		}
	}
	public void balancecheck()
	{
		System.out.println("Current balance is: "+balance);
	}
	
	public static void main(String[] args) 
	{
		//variable declaration
		 double amount;
		 double bal;
		 int userResponse;
		 
		Scanner scn= new Scanner(System.in);
		ATMMainClass atm = new ATMMainClass();
		
		atm.balancecheck();
		
		System.out.println("***Bank Operations are: ");
		System.out.println("For Deposit press 1");
		System.out.println("For Withdraw press 2");
		System.out.println("For Balance Enquiry press 3");
		System.out.println("For Exit press 4");
		System.out.println("Choose Your Operation: ");
		userResponse = scn.nextInt();
		if(userResponse == 1)
		{
			System.out.println("How Much Money You want to deposit :");
			amount = scn.nextDouble();
			atm.depositing(amount);
			atm.balancecheck();
		}
		if(userResponse == 2)
		{
			System.out.println("How Much Money You want to withdrwal :");
			amount = scn.nextDouble();
			atm.withdrawing(amount);
			atm.balancecheck();
		}
		if(userResponse == 3)
		{
			atm.balancecheck();
		}
		if(userResponse == 4)
		{
			System.out.println("Thank You!!Visit Again");
		}
		
	}
}
