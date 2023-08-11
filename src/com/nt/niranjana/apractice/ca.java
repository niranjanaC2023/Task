package com.nt.niranjana.apractice;

import java.util.Scanner;

public class ca {

	public void add()
	{
		double add1;
		double add2;
		double result;
		Scanner scn = new Scanner(System.in);
		System.out.println("1no:");
		add1 =scn.nextDouble();
		System.out.println("2no:");
		add2 =scn.nextDouble();
		result= add1+add2;
		System.out.println("Result: "+result);
	}
	public void add2(int...vargs)
	{
		System.out.println("vargs length: "+vargs.length);
		for(int arg : vargs)
		{
			System.out.println(arg);
		}
	}
	public void sub()
	{
		double add1;
		double add2;
		double result;
		Scanner scn = new Scanner(System.in);
		System.out.println("1no:");
		add1 =scn.nextDouble();
		System.out.println("2no:");
		add2 =scn.nextDouble();
		result= add1-add2;
		System.out.println("Result: "+result);
	}
}
