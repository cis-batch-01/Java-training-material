package com.spottify.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		SimpleDateFormat songDurationFormat=new SimpleDateFormat("mm:ss");
		System.out.println("Enter the no of songs");
		int noOfSongs=Integer.parseInt(scan.nextLine());
		List<Song> songList=new ArrayList<Song>();
		System.out.println("Enter the song details:");
		for(int i=0;i<noOfSongs;i++)
		{
			String detail=scan.nextLine();
			String datas[]=detail.split(",");
			try {
				List<Artist> songArtistList=BasicOperations.fetchArtist(datas[4]);
				Song song=new Song(datas[0], datas[1],songDurationFormat.parse(datas[2]) ,
						Double.parseDouble(datas[3]), songArtistList);
				songList.add(song);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		System.out.println(songList);
		//artist up to date
		List<Artist> newArtistList=Artist.prefill();
		for(Artist artist:newArtistList)
		{
			List<Song> artistSongList=BasicOperations.fetchSongs(songList, artist.getName());
			artist.setSongList(artistSongList);
		}
		System.out.println("Enter the dob of Artist");
		String dob=scan.nextLine();
		List<Song> resList=BasicOperations.specialCollection(newArtistList, dob);
		System.out.println(resList!=null?"found":"not found");
		for (Song song : resList) {
			System.out.println(song);
		}
			}
}
