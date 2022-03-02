package com.exception.samples.userdefined;

public class UserNotFoundException extends RuntimeException{

	String message;
	
	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

}
