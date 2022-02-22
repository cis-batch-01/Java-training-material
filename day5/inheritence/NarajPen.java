package com.technocis.inheritence;

import java.util.Date;

public class NarajPen extends RefillPen {

	private String bodyType;
	private String inkType;
	private String color;
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getInkType() {
		return inkType;
	}
	public void setInkType(String inkType) {
		this.inkType = inkType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public NarajPen(int mId, Date manDate, Date invoiceDate, String color, int size, String cType, String bodyType,
			String inkType, String color2) {
		super(mId, manDate, invoiceDate, color, size, cType);
		this.bodyType = bodyType;
		this.inkType = inkType;
		color = color2;
	}
	
	
}
