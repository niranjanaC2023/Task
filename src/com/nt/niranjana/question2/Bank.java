package com.nt.niranjana.question2;

import java.util.Scanner;

public class Bank 
{	
	public static void main(String[] args) 
	{
		//variable declaration
		 double amount;
		 long accNumber;
		 double bal;
		 int userResponse;
		 
		Scanner scn= new Scanner(System.in);
		System.out.println("****WELCOME TO SBI BANK****");
		
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.balance=1000;
		bankAccount.accountNumber=1119199L;
		bankAccount.accountDetails();
		
		System.out.println("Please Enter Your Account Number: ");
		accNumber=scn.nextLong();
		
		if(bankAccount.accountNumber == accNumber)
		{
			System.out.println("***Bank Operations are: ");
			System.out.println("For Deposit press 1");
			System.out.println("For Withdraw press 2");
			System.out.println("For Balance Enquiry press 3");
			System.out.println("For Account Details press 4");
			System.out.println("For Exit press 5");
			System.out.println("Choose Your Operation: ");
			userResponse = scn.nextInt();
			if(userResponse == 1)
			{
				System.out.println("How Much Money You want to deposit :");
				amount = scn.nextDouble();
				bankAccount.deposit(amount);
				scn.nextLine();
				bankAccount.balanceEnquiry();
			}
			if(userResponse == 2)
			{
				System.out.println("How Much Money You want to withdrwal :");
				amount = scn.nextDouble();
				bankAccount.withdrawl(amount);
				bankAccount.balanceEnquiry();
			}
			if(userResponse == 3)
			{
				bankAccount.balanceEnquiry();
			}
			if(userResponse == 4)
			{
				bankAccount.accountDetails();
			}
			if(userResponse == 5)
			{
				System.out.println("Thank You!!Visit Again");
			}
		}
		else 
		{
			System.out.println("Your account didn't have exists");
		}
	}

}
