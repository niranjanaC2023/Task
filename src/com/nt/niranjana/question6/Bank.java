package com.nt.niranjana.question6;

public class Bank 
{
	//static fields
	private static String bankName;
	private static String branchName;
	private static String ifscCode;
	
	//instance variable
	private long accNum;
	private String accHolderName;
	private double balance;
	
	static
	{
		bankName = "canara bank";
		branchName = "chatrapur";
		ifscCode = "CB0000053";
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//display  the value of BankAccount object
	public void display()
	{
		System.out.println("Bank Name: "+bankName);
		System.out.println("Branch Name: "+branchName);
		System.out.println("Ifsc Code: "+ifscCode);
		System.out.println("Account Holder Name: "+accHolderName);
		System.out.println("Account Number: "+accNum);
		System.out.println("Balance: "+balance);
	}

}
