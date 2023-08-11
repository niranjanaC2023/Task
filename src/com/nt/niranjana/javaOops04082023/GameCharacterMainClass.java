package com.nt.niranjana.javaOops04082023;

public class GameCharacterMainClass 
{
	public static void main(String[] args) 
	{
		GameCharacter[] gameCharacter = new GameCharacter[3];
		gameCharacter[0] = new Knight();
		gameCharacter[1] = new Wizard();
		gameCharacter[2] = new Archer();
		
		for(GameCharacter gamech : gameCharacter)
		{
			gamech.attack();
			gamech.defend();
		}
		
	}

}
