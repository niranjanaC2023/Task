package com.nt.niranjana.javaOops04082023;

public class AnimalClassMainClass 
{
	public static void main(String[] args) 
	{
		Animal animalDog = new Dog();
		animalDog.makeSound();
		animalDog.move();
		System.out.println();
		
		Animal animalCat = new Cat();
		animalCat.makeSound();
		animalCat.move();
		System.out.println();
		
		Animal animalBird = new Bird();
		animalBird.makeSound();
		animalBird.move();
		
	}
}
