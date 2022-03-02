package com.polymorphism.inter01;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		
		Bank cBank=new CoraporateBank();
		cBank.createAccount("", true);
		
		Bank bank=new UrbanBank();
		bank.createAccount("", true);
		
	//	Bank bank1=new Bank();  cant create interface object
		List list=new ArrayList();
		
	}

}
