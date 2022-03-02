package com.polymorphism.inter01;

public class UrbanBank implements Bank{

	public boolean createAccount(String accountDetails) {
		
		return false;
	}

	public boolean createAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createAccount(String accountDetails, boolean sinourCitiztion) {
		System.out.println("Urban bank Account");
		return false;
	}

}
