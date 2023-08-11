package com.nt.niranjana.javaOops04082023;

public class DrawCircle implements Drawable 
{
	

	@Override
	public void draw() 
	{
		System.out.println("Circle draw like round");
	}

	@Override
	public String toString() {
		return "DrawCircle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
