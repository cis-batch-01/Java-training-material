package com.technocis.inheritence;

import java.util.Date;

public class ParkerPen extends RefillPen {
	
	private String brandName;
	private String model;
	private double price;        //25.50
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ParkerPen(int mId, Date manDate, Date invoiceDate, String color, int size, String cType, String brandName,
			String model, double price) {
		super(mId, manDate, invoiceDate, color, size, cType);
		this.brandName = brandName;
		this.model = model;
		this.price = price;
	}
	public ParkerPen(int mId, Date manDate, Date invoiceDate, String color, int size, String cType) {
		super(mId, manDate, invoiceDate, color, size, cType);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
