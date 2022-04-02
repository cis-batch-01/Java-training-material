package com.materials.gsondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonWithAssociation {

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		User user=new User("manoj","manojjohn1838@gmail.com", "manoj12345");
		GsonBuilder builder=new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson=builder.create();
		try {
			Payment pay=new Payment(1,sdf.parse("01-04-2022 14:24:00"),"cash",user);
			System.out.println(pay);
			System.out.println(gson.toJson(pay));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}

	}

}
