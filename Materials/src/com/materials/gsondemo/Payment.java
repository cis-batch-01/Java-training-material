package com.materials.gsondemo;

import java.util.Date;

public class Payment {
	
	private int id;
	
	private Date time;
	private String mode;
	private User user;
	
	public Payment(int id, Date time, String mode, User user) {
		super();
		this.id = id;
		this.time = time;
		this.mode = mode;
		this.user = user;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "payment [id=" + id + ", time=" + time + ", mode=" + mode + ", user=" + user.getEmail() + "]";
	}
	

}
