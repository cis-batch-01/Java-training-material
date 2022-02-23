package com.technocis.oops;

import java.util.Date;

public class TeslaCar extends Car{
	
	private int topSpeed;
	private String features;

	public TeslaCar(String model, String fuelType, Date manDate) {
		super(model, fuelType, manDate);
		
	}

	@Override
	public void display() {
		
		System.out.println("Tesla");
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public TeslaCar(String model, String fuelType, Date manDate, int topSpeed, String features) {
		super(model, fuelType, manDate);
		this.topSpeed = topSpeed;
		this.features = features;
	}
	
	public void fillFuel()
	{
		System.out.println("Charged...");
	}

}
