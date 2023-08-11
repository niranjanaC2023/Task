package com.nt.niranjana.javaOops04082023;

public class Cat extends Animal
{
	@Override
	public void makeSound() 
	{
		System.out.println("Cats make sounds like meows, chirrups, hisses, purrs, chatters, and growls");
	}

	@Override
	public void move() 
	{
		System.out.println("Cats can move various way like stretching, kneading, pouncing, stalking, and grooming.");
	}
}
