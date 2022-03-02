package com.polymorphism.inter;

public class  Bank {
	
	 boolean createAccount(String accountDetails)
	 {
		 System.out.println("Account created");
		return true;
		 
	 }
	 boolean createAccount(Account account)
	 {
		 System.out.println("");
		 return true;
	 }
	 boolean createAccount(String accountDetails,boolean sinourCitiztion)
	 {
		 System.out.println("Account created");
		return true;
		 
	 }//1.No of param   2.datatypes

}
