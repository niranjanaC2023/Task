package com.nt.niranjana.javaOops04082023;

public class AbstractClassShapeMainClass 
{

	public static void main(String[] args) 
	{

		AbstractClassShape circleShape = new AbstractClassCircle(4);
		circleShape.calculateArea();
		circleShape.calculatePerimeter();
		System.out.println();
		
		AbstractClassShape triangleShape = new AbstractClassTriangle(5,3,5);
		triangleShape.calculateArea();
		triangleShape.calculatePerimeter();
		System.out.println();
		
		
		AbstractClassShape rectangleShape = new AbstractClassRectangle(5,3);
		rectangleShape.calculateArea();
		rectangleShape.calculatePerimeter();
		System.out.println();
		
	}
}
