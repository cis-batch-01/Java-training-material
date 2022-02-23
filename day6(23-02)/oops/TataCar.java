package com.technocis.oops;

import java.util.Date;

public class TataCar extends Car {
	
	private double price;
	private int topSpeed;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public TataCar(String model, String fuelType, Date manDate) {
		super(model, fuelType, manDate);
		
	}
	public TataCar(String model, String fuelType, Date manDate, double price, int topSpeed) {
		super(model, fuelType, manDate);
		this.price = price;
		this.topSpeed = topSpeed;
	}
	@Override
	public void display() {
		System.out.println("Tata");
	}
	public void fillFuel()
	{
		System.out.println(super.getFuelType()+" filled");
	}
	

}
