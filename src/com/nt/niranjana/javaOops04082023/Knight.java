package com.nt.niranjana.javaOops04082023;

public class Knight extends GameCharacter 
{

	@Override
	public void attack() 
	{
		System.out.println("Knight: Attack with Sword");
	}

	@Override
	public void defend() 
	{
		System.out.println("Knight: Defend with shield");
	}
	
}
