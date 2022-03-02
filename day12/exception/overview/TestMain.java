package com.exception.overview;

public class TestMain {
	public static void main(String[] args) {

		int devisor = 10, divider = 0;
		String name = null;
		try {
			int res = devisor / divider;
			System.out.println(name.charAt(0));
		} catch (ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (NullPointerException e) {
			System.out.println("no value innitialized");
		}
		System.out.println("After try block");

	}

}
