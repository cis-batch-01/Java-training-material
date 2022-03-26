package com.materials.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {

		String name = "Beast";
		double price= 250;
		int realeaseYear = 2022;

		String movieDetails = name + "," + price + "," + realeaseYear;

		byte[] content = movieDetails.getBytes();

		Path path = Paths.get("movies.txt");

		Files.write(path, content);

	}

}
