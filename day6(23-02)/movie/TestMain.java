package com.technocis.movie;

import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Movie 1 Details:");
		String movieData1=scan.nextLine();			//get user input as a single string
		System.out.println("Enter Movie 2 Details:");
		String movieData2=scan.nextLine();
		
		String[] movieDatas1=movieData1.split(",");   //split the data to create an object
		Movie movie1=new Movie(movieDatas1[0], Double.parseDouble(movieDatas1[1]),Double.parseDouble(movieDatas1[2]), Double.parseDouble(movieDatas1[3]));
		System.out.println("Movie 1:");
		System.out.println(movie1);				//print using toString method
		
		String[] movieDatas2=movieData2.split(",");
		String mName=movieDatas2[0];
		double boxOffice=Double.parseDouble(movieDatas2[1]);
		double budget=Double.parseDouble(movieDatas2[2]);
		double rating=Double.parseDouble(movieDatas2[3]);
		Movie movie2=new Movie(mName, boxOffice, budget, rating);
		
		System.out.println("Movie 2");
		System.out.println(movie2);			//print using toString method
		
		System.out.println(movie1.equals(movie2)?"Movie 1 and movie 2 are same":"Movie 1 and 2 are different");
	}

}
