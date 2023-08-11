package com.nt.niranjana.javaOops04082023;

public class AbstractClassTriangle extends AbstractClassShape 
{

	private double base;
	private double side;
	private double height;
	private double areaResult;
	private double perimeterResult;
	
	@Override
	double calculateArea() 
	{
		areaResult = (base*height)/2;
		System.out.println("Area of Tiangle: "+areaResult);
		return areaResult;
	}

	@Override
	double calculatePerimeter() 
	{
		perimeterResult = base+side+base;
		System.out.println("perimeter of Triangle: "+perimeterResult);
		return perimeterResult;
	}

	public AbstractClassTriangle(double base, double side, double height) {
		super();
		this.base = base;
		this.side = side;
		this.height = height;
	}
	

}
