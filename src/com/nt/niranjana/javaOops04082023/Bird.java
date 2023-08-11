package com.nt.niranjana.javaOops04082023;

public class Bird extends Animal 
{

	@Override
	public void makeSound() 
	{
		System.out.println("Birds make sounds like chirps, rattles, whistles, trills, croaks, drumming");
	}

	@Override
	public void move() 
	{
		System.out.println("Birds can move various way like flapping their wings,also walk, hop, and swim.");
	}
}
