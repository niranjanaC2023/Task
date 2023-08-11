package com.nt.niranjana.javaOops04082023;

public class CreditCardPayment implements Payment 
{

	@Override
	public void processPayment() 
	{
		System.out.println("Payment happend through CreditCardPayment");
	}

	@Override
	public void refund() 
	{
		System.out.println("refund will take 3 working days in CreditCardPayment");
	}

}
