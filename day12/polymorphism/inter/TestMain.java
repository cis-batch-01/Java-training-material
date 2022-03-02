package com.polymorphism.inter;

public class TestMain {
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.createAccount("account details");
		Bank cBank=new CoraporateBank();
		cBank.createAccount("account details");
		
	}

}
