package com.technocis.interfacesample;

public class Dog implements AnimalImplementable {

	private String breed;
	private String color;
	private double price;
	private String gender;

	public void sound() {

		System.out.println("dog are bark");
	}

	public void display() {

		System.out.println("Print all the datas");

	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
