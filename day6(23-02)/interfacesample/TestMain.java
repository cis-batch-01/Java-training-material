package com.technocis.interfacesample;

import javax.swing.ButtonGroup;

public class TestMain {
	public static void main(String[] args) {
		Dog dog =new PugDog();
		dog.sound();
		AnimalImplementable ab=new PugDog();
		ab.display();
	}

}
