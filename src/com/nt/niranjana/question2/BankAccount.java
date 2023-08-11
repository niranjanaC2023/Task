package com.nt.niranjana.question2;

public class BankAccount {
	
	 long accountNumber;
	 double balance;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void currentBalance()
	{
		System.out.println("Current Balance is: "+balance);
	}
	
	public void deposit(double amount)
	{
		this.balance = balance+amount;
		System.out.println(amount+" Rupees are credited in your account");
	}
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void withdrawl(double amount)
	{
		if(balance>=amount)
		{
		this.balance = balance-amount;
		System.out.println(amount+"\tRupees are deducted from your account");
		}
		else {
			System.out.println("You don't have sufficient balance");
		}
	}
	
	void accountDetails()
	 {
	 System.out.print("ACCOUNT NUMBER: "+accountNumber);
	 System.out.println();
	 System.out.print("AVAILABLE BALANCE: "+balance);
	 System.out.println();
	 }
	
	void balanceEnquiry()
	{
		this.accountDetails();
	}
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	

}
