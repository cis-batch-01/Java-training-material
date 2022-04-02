package com.materials.gsondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JsonAssosiationList {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		UserDemo user = new UserDemo(1, "manoj", "manojjohn1838@gmail.com", "manoj12345",
				(List) new ArrayList<PaymentDemo>());
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();
		List<PaymentDemo> paymentList = new ArrayList<PaymentDemo>();
		try {
			PaymentDemo pay1 = new PaymentDemo(1, sdf.parse("01-04-2022 16:15:00"), "cash", 500.0, user);
			paymentList.add(pay1);
			PaymentDemo pay2 = new PaymentDemo(2, sdf.parse("01-04-2022 16:12:00"), "cash", 600.50, user);
			paymentList.add(pay2);
			user.setPaymentList(paymentList);
			
			System.out.println(user);
			String newData=gson.toJson(user);
			System.out.println(gson.toJson(user));
			
			
			
			
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

}

class UserDemo {
	private int id;
	private String name;
	private String email;
	private String password;
	private ArrayList<PaymentDemo> paymentList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public List<PaymentDemo> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(List<PaymentDemo> paymentList) {
		this.paymentList = (ArrayList<PaymentDemo>) paymentList;
	}

	public UserDemo(int id, String name, String email, String password, List<PaymentDemo> paymentList) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.paymentList = (ArrayList<PaymentDemo>) paymentList;
	}

	public UserDemo() {
		super();
	}

	@Override
	public String toString() {
		return "UserDemo [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", paymentList=" + paymentList + "]";
	}

}

class PaymentDemo {

	private int id;

	public PaymentDemo(int id, Date time, String mode, Double amount, UserDemo user) {
		super();
		this.id = id;
		this.time = time;
		this.mode = mode;
		this.amount = amount;
		this.user = user;
	}

	private Date time;
	private String mode;
	private Double amount;
	private transient UserDemo user;

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

	public UserDemo getUser() {
		return user;
	}

	public void setUser(UserDemo user) {
		this.user = user;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "payment [id=" + id + ", time=" + time + ", mode=" + mode + ", amount=" + amount + ", user="
				+ user.getEmail() + "]";
	}

}
