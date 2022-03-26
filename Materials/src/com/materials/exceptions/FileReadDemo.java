package com.materials.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadDemo {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("movies1.txt"); //File is not present

			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				System.out.println(line);
			}		
		} catch (NoSuchFileException e) 
		{
			System.out.println("Error Message:" + e.getMessage());
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("Error Message:" + e.getMessage());
			e.printStackTrace();
		}
	}
}
// Note: If the file "movies1.txt" is not present, it will throw