package com.polymorphism.inter;

public class CoraporateBank extends Bank{
	
	 boolean createAccount(String accountDetails) //overridding
	 {
		 System.out.println("Account created with coraparate statnds");
		return true;
		 
	 }
	 boolean createAccount(String accountDetails,double rating)
	 {
		 System.out.println("Account with specific rating");
		return true;
		 
	 }

}
