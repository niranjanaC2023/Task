package com.nt.niranjana.javaOops04082023;

public class CashPayment implements Payment 
{

	@Override
	public void processPayment() 
	{
		System.out.println("Payment happend through CashPayment");
	}

	@Override
	public void refund() 
	{
		System.out.println("refund will take 7 working days in CashPayment");
	}

}
