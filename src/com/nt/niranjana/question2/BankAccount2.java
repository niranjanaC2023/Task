package com.nt.niranjana.question2;

public class BankAccount2 {
	
	 long accountNumber;
	 String accHolderName;
	 String password;
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
	
	
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BankAccount2() {
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
	 System.out.print("AVAILABLE BALANCE: "+balance);
	 System.out.println();
	 System.out.print("ACCOUNT HOLDER NAME : "+accHolderName);
	 System.out.println();
	 System.out.print("HOLDER PASSWORD : "+password);
	 System.out.println();
	 }
	
	void balanceEnquiry()
	{
		this.accountDetails();
	}
	public BankAccount2(long accountNumber, String accHolderName, String password, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accHolderName = accHolderName;
		this.password = password;
		this.balance = balance;
	}

}
