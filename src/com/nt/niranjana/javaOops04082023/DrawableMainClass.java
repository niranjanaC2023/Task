package com.nt.niranjana.javaOops04082023;

public class DrawableMainClass 
{
	public static void main(String[] args) 
	{
		
		Drawable[] drawArray = new Drawable[3] ;
		drawArray[0] = new DrawCircle();
		drawArray[1] = new DrawTriangle();
		drawArray[2] = new DrawRectangle();
		
		for(Drawable draw : drawArray)
		{
			draw.draw();
		}		
		
	}
}
