package com.materials.stringsamples;

public class StringBuilderSample {

	public static void main(String[] args) {
		StringBuilder content = new StringBuilder("manoj");
		
		// StringBuilder is MUTABLE. 
		// reverse() will change the value 
		// and store the result in "content" variable.		
		
		content.reverse();  
		
		System.out.println(content); //Output: jonam

	}

}
