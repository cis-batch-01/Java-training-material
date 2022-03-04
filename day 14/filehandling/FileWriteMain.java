package com.properties.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriteMain {
	public static void main(String[] args) {
		
		File file=new File("d://sample.txt");
		try {
			OutputStream fileWrite=new FileOutputStream(file);
			String data="manoj";
			for(int i=0;i<data.length();i++)
			{
				if(file.canWrite())
				{
					fileWrite.write(data.charAt(i));
				}
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("File not there".concat(e.toString()));
			
		} catch (IOException e) {
			
			System.out.println("Cant write in the file"+e);
		}
		
	}

}
