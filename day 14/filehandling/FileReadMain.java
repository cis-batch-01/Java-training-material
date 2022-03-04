package com.properties.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadMain {
	public static void main(String[] args) {
		
		File file=new File("D:\\sample.txt");
		try {
			InputStream fileRead=new FileInputStream(file);
			while(fileRead.available()!='\0')
			{
			System.out.print((char)fileRead.read());
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("File not there"+e);
		} catch (IOException e) {
			
			System.out.println("Data not there"+e);
		}
		
	}

}
