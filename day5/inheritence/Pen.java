package com.technocis.inheritence;

import java.util.Date;

public class Pen {
	
	private int mId;
	private Date manDate;
	private Date invoiceDate;
	private String color;
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public Date getManDate() {
		return manDate;
	}
	public void setManDate(Date manDate) {
		this.manDate = manDate;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Pen(int mId, Date manDate, Date invoiceDate, String color) {
		super();
		this.mId = mId;
		this.manDate = manDate;
		this.invoiceDate = invoiceDate;
		this.color = color;
	}
	public Pen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
