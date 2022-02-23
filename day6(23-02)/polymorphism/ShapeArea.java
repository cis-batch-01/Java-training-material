package com.technocis.polymorphism;

public class ShapeArea {
	
	public void calculateArea()
	{
		System.out.println("inputs needed to calculate area");
	}
	public void calculateArea(int side)
	{
		System.out.println("Square area from int value is"+Math.pow(side, 2));
	}
	public void calculateArea(double side)
	{
		System.out.println("Square area from double value is"+Math.pow(side, 2));
	}
	public void calculateArea(double length,double breadth)
	{
		System.out.println("Area of Rectangle is "+length*breadth);
	}
	public void calculateArea(int length,int breadth)
	{
		System.out.println("Area of Rectangle is "+length*breadth);
	}
	

}

//2.no of parameters or datatype of parameteres