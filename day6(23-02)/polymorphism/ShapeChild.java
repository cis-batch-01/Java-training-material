package com.technocis.polymorphism;

public class ShapeChild extends ShapeArea {
	
	public void calculateArea()
	{
		
	}
	public void calculateArea(int length,int breadth,int height)
	{
		System.out.println("Area of Rectangle is "+length*breadth*height);
	}

}
