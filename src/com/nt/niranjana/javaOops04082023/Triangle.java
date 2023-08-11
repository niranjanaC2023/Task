package com.nt.niranjana.javaOops04082023;

public class Triangle extends Shape
{
	private double base;
	private double height;
	private double areaResult;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}


	@Override
	public double calculateArea() 
	{
		areaResult = (base*height)/2;
		System.out.println("Area of Triangle: "+areaResult);
		return areaResult;
	}
	

}
