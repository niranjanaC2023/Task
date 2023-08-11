package com.nt.niranjana.javaOops04082023;

public class Dog extends Animal 
{
	@Override
	public void makeSound() 
	{
		System.out.println("Dogs make sounds like barking");
	}

	@Override
	public void move() 
	{
		System.out.println("Dogs can move various way like walking, running, trotting, galloping, jumping, swimming, and crawling");
	}
}
