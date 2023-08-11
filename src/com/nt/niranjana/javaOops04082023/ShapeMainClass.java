package com.nt.niranjana.javaOops04082023;

public class ShapeMainClass 
{

	public static void main(String[] args) 
	{

		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(3);
		shapes[1] = new Triangle(3,4);
		shapes[2] = new Rectangle(3,4);
		
		for(Shape shape : shapes)
		{
			shape.calculateArea();
		}
	}
}
