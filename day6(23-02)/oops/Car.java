package com.technocis.oops;

import java.util.Date;

public abstract class Car {
	
	private String model;
	private String fuelType;
	private Date manDate;
	public Car(String model, String fuelType, Date manDate) {
		super();
		this.model = model;
		this.fuelType = fuelType;
		this.manDate = manDate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Date getManDate() {
		return manDate;
	}

	public void setManDate(Date manDate) {
		this.manDate = manDate;
	}

	public abstract void display();
	
	public void fillFuel()
	{
		System.out.println("filled");
	}
}
