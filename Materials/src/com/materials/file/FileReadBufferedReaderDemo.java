package com.materials.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadBufferedReaderDemo {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("movies.txt"))) {
			String currentLine = null;
			while ((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
