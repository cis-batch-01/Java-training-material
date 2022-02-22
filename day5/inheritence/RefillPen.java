package com.technocis.inheritence;

import java.util.Date;

public class RefillPen extends Pen 
{
	private int size;
	private String cType;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public RefillPen(int mId, Date manDate, Date invoiceDate, String color, int size, String cType) {
		super(mId, manDate, invoiceDate, color);
		this.size = size;
		this.cType = cType;
	}
	
	public RefillPen(int mId, Date manDate, Date invoiceDate, String color) {
		super(mId, manDate, invoiceDate, color);
		// TODO Auto-generated constructor stub
	}
	

}
