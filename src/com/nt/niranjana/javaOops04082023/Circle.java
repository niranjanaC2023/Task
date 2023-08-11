package com.nt.niranjana.javaOops04082023;

public class Circle extends Shape
{
	private double radius;
	private double areaResult;


	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double calculateArea() 
	{
		areaResult = Math.PI*radius*radius;
		System.out.println("Area of Circle: "+areaResult);
		return areaResult;
	}
	

}
