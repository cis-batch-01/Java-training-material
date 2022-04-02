package com.materials.gsondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonWithTransient {

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		UserClass user=new UserClass("manoj","manojjohn1838@gmail.com", "manoj12345");
		GsonBuilder builder=new GsonBuilder();
		builder.setDateFormat("dd-MM");
		builder.setPrettyPrinting();
		Gson gson=builder.create();
		try {
			PaymentClass pay=new PaymentClass(1,sdf.parse("01-04-2022 14:24:00"),"cash",user);
			System.out.println(pay);
			System.out.println(gson.toJson(pay));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}

	}

}
class UserClass {
	
	private String name;
	private String email;
	private transient String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserClass(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}	
}
class PaymentClass {
	
	private int id;
	public PaymentClass(int id, Date time, String mode, UserClass user) {
		super();
		this.id = id;
		this.time = time;
		this.mode = mode;
		this.user = user;
	}
	private Date time;
	private String mode;
	private UserClass user;
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
	
	public UserClass getUser() {
		return user;
	}
	public void setUser(UserClass user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "payment [id=" + id + ", time=" + time + ", mode=" + mode + ", user=" + user.getEmail() + "]";
	}
	

}

