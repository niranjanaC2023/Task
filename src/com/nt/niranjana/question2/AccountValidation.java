package com.nt.niranjana.question2;

import java.util.Scanner;

public class AccountValidation
{
	UsersData obj  = new UsersData();
	
	
	public void loginAuth()
	{
		String name;
		String password;
		
		BankAccount2 data = new BankAccount2();
		data.accHolderName="aa";
		data.password="bb";
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		name = scn.nextLine();
		
		System.out.println("Enter Your password:");
		password = scn.nextLine();
		
		if(data.accHolderName.equals(name) && data.password.equals(password))
		{
			System.out.println("Welcome Mr."+name);
			obj.usersRequest();
			
		}
		else {
			System.out.println("Wrong Id & Pwd");
		}
	}

}
