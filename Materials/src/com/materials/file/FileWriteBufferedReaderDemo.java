package com.materials.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteBufferedReaderDemo {
	public static void main(String[] args) {
	String content = "RRR,300.0,2022";
		
		try {
			FileWriter writer = new FileWriter("movies.txt");
			BufferedWriter buffer = new BufferedWriter(writer);
			buffer.write(content);
			buffer.close();
			System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
