package com.materials.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("movies.txt");

		List<String> lines = Files.readAllLines(path);
		for (String line : lines) {
			System.out.println(line);
		}
	}
}

/* movies.txt
KGF Chapter 2,250,2022-04-24
RRR,300,2022-03-24
*/

/*Output : 
KGF Chapter 2,250,2022-04-24
RRR,300,2022-03-24
*/


