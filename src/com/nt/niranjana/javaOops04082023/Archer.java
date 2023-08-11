package com.nt.niranjana.javaOops04082023;

public class Archer extends GameCharacter 
{

	@Override
	public void attack() 
	{
		System.out.println("Archer: Shooting arrows with precision!");
	}

	@Override
	public void defend() 
	{
		System.out.println("Archer: Dodging and evading attacks!");
	}

}
