package com.materials.input;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		
		//Get Movie details like name, language from user.
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter name: ");
				String name = scanner.next();
				System.out.println("Enter Language: ");
				String language =  scanner.next();
				
				System.out.println("You have entered - name=" + name + ",language=" + language);		
				scanner.close();

	}

}
