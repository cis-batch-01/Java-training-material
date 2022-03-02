package com.polymorphism.inter01;

public class CoraporateBank implements Bank{
	
	 public boolean createAccount(String accountDetails) //overridding
	 {
		 System.out.println("Account created with coraparate statnds");
		return true;
		 
	 }
	 boolean createAccount(String accountDetails,double rating)
	 {
		 System.out.println("Account with specific rating");
		return true;
		 
	 }
	public boolean createAccount(Account account) {
		System.out.println("Acount created with object");
		return true;
	}
	public boolean createAccount(String accountDetails, boolean sinourCitiztion) {
		System.out.println("Its a corporate bank object");
		return false;
	}

}
