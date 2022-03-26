package com.materials.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream inputStream = new FileInputStream(new File("studentObject.ser"));
		ObjectInputStream in = new ObjectInputStream(inputStream);
		Student student = (Student)in.readObject();
		System.out.println(student);
		in.close();
		inputStream.close();
	}
}
