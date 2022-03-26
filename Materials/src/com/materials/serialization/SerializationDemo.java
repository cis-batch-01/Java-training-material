package com.materials.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Student student = new Student("Manoj", "manoj@gmail.com", "pass123");
		// writing object into file
		try (
		 FileOutputStream f = new FileOutputStream("studentObject.ser");
				ObjectOutputStream out = new ObjectOutputStream(f)) {
			out.writeObject(student);
			out.flush();
			out.close();
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
