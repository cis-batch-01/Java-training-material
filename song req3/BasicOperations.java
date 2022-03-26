package com.spottify.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasicOperations {
	
	public static List<Artist> fetchArtist(String data)
	{
		String names[]=data.split("-");
		List<Artist> resList=new ArrayList<Artist>();
		
		List<Artist> artistList=Artist.prefill();
		for(Artist artist:artistList)
		{
			for(int i=0;i<names.length;i++)
			{
				if(names[i].equals(artist.getName()))
				{
					resList.add(artist);
				}
			}
			
		}
		return resList;
	}
	public static List<Song> specialCollection(List<Artist> artistList,String dob)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		List<Song> resList=new ArrayList<Song>();
		for(Artist artist:artistList)
		{
			if(sdf.format(artist.getDob()).equals(dob))
			{
				resList=artist.getSongList();
			}
			
		}
		return resList;
	}
	public static List<Song> fetchSongs(List<Song> songList,String name)
	{
		List<Song> resList=new ArrayList<Song>();

		List<Artist> artistList=Artist.prefill();
		for(Song song:songList)
		{
			for(Artist songArtist:song.getArtistList())
			{
				if(songArtist.getName().equals(name))
				{
					resList.add(song);
				}
			}
			
		}
		return resList;
		
	}
}
