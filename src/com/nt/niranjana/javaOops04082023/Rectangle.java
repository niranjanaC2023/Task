package com.nt.niranjana.javaOops04082023;

public class Rectangle extends Shape
{
	private double length;
	private double width;
	private double areaResult;
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}



	@Override
	public double calculateArea() 
	{
		areaResult = length*width;
		System.out.println("Area of Rectangle: "+areaResult);
		return areaResult;
	}
	

}
