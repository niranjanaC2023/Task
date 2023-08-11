package com.nt.niranjana.javaOops04082023;

public class AbstractClassCircle extends AbstractClassShape 
{

	private double radius;
	private double areaResult;
	private double perimeterResult;
	@Override
	double calculateArea() 
	{
		areaResult = Math.PI*radius*radius;  
		System.out.println("Area of Circle: "+areaResult);
		return areaResult;
	}

	@Override
	double calculatePerimeter() 
	{
		perimeterResult = 2*Math.PI*radius;
		System.out.println("perimeter of Circle: "+perimeterResult);
		return perimeterResult;
	}

	public AbstractClassCircle(double radius) {
		super();
		this.radius = radius;
	}
	
	

}
