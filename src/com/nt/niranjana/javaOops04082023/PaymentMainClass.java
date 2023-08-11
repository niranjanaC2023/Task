package com.nt.niranjana.javaOops04082023;

public class PaymentMainClass 
{
	public static void main(String[] args) 
	{
		Payment[] paymentList = new Payment[3];
		paymentList[0] = new CreditCardPayment();
		paymentList[1] = new PayPalPayment();
		paymentList[2] = new CashPayment();
		
		for(Payment payment : paymentList)
		{
			payment.processPayment();
			payment.refund();
		}
				
		
	}

}
