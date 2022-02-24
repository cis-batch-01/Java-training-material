package corejavasamples.music;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) throws NumberFormatException, ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter song 1 detail:");
		String userData1=scan.nextLine();
		String [] datas=userData1.split(",");
		Song song1=new Song(datas[0], datas[1],sdf.parse( datas[2]), Double.parseDouble(datas[3]));
		
		System.out.println("Enter song 2 detail:");
		String userData2=scan.nextLine();
		datas=userData2.split(",");
		Song song2=new Song(datas[0], datas[1],sdf.parse( datas[2]), Double.parseDouble(datas[3]));
		System.out.println("Song List");
		System.out.format("%-15s%-20s%-10s%-6s\n", "Title","Genre","Duration","Rating");
		System.out.println(song1);
		System.out.println(song2);
		System.out.println();
		System.out.println(song1.equals(song2)?"Song 1 and Song 2 are Same":"Song 1 and 2 are different");
	}

}
