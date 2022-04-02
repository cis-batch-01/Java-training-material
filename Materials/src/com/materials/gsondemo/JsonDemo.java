package com.materials.gsondemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDemo {
	public static void main(String[] args) {
		
		User user=new User("Manoj", "manojjohn1838@gmail.com","manoj12345");
	      
	      GsonBuilder builder = new GsonBuilder();
	      
	      builder.setPrettyPrinting();
	      Gson gson = builder.create();
	      
	      //serialize the object
	      String userData=gson.toJson(user);
	      System.out.println(userData);
	      //de-serialization
	      User user1=gson.fromJson(userData, User.class);
	      System.out.println(user1);
	}

}
