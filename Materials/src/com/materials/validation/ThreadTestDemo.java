package com.materials.validation;

class SMSThread extends Thread {
	public void run() {
		System.err.println("This code is running in a SMSThread");
	}
}

public class ThreadTestDemo {

	public static void main(String[] args) {
		System.out.println(" Main method started ");
		SMSThread thread = new SMSThread();		
		thread.start();
		System.out.println("This code is outside of the thread");
		System.out.println(" Main method completed ");
	}

}
