package com.polymorphism.inter01;

public interface Bank {
	
	public boolean createAccount(String accountDetails);
	public boolean createAccount(Account account);
	public boolean createAccount(String accountDetails,boolean sinourCitiztion);
	
}
