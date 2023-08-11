package com.nt.niranjana.javaOops04082023;

public class AbstractClassRectangle extends AbstractClassShape 
{

	private double length;
	private double width;
	private double areaResult;
	private double perimeterResult;
	
	@Override
	double calculateArea() 
	{
		areaResult = length*width;
		System.out.println("Area of Rectangle: "+areaResult);
		return areaResult;
	}

	@Override
	double calculatePerimeter() 
	{
		perimeterResult = 2*(length+width);
		System.out.println("perimeter of Rectangle: "+perimeterResult);
		return perimeterResult;
	}

	public AbstractClassRectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	

}
