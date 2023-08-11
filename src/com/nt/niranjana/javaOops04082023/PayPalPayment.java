package com.nt.niranjana.javaOops04082023;

public class PayPalPayment implements Payment 
{

	@Override
	public void processPayment()
	{
		System.out.println("Payment happend through PayPalPayment");
	}

	@Override
	public void refund()
	{
		System.out.println("refund will take 4 working days in PayPalPayment");
	}

}
