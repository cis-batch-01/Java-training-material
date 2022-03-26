package com.materials.validation;

import java.time.LocalDate;

public class MovieValidation {
	/**
	 * This method should valid whether the given details is valid or not
	 * 
	 * @param Movie details
	 * @throws Exception
	 */
	public static void validateMovieDetails(String name, int price, LocalDate lastTheatreDate) throws Exception {
		if (name == null || name.equals("") || name.trim().equals("")) {
			throw new Exception("Name cannot be null"); // Raise a problem
		}
		else if (price < 0) {
			throw new Exception("Price must be greater than zero");
		}
		else if ( lastTheatreDate.isAfter(LocalDate.now())) {
			throw new Exception("Movie Must Set into Upcoming Category");
		}
		System.out.println("Validation Method completed");
	}

	public static void main(String[] args) {

		// Input
		String name = "KGF Chapter 2";
		int price = -200;
		LocalDate lastTheatreDate = LocalDate.parse("2023-01-01");
		try {
			// validation
			validateMovieDetails(name, price,lastTheatreDate);
			// if validation is success
			System.out.println("Validation Passed");

		} catch (Exception ex) {
			// if validation failed
			ex.printStackTrace();
			System.out.println("Exception:" + ex.getMessage());
		}

	}

}
