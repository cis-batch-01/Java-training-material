package com.spottify.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Artist {
	private String name;
	private String role;
	private String gender;
	private Date dob;
	private List<Song> songList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<Song> getSongList() {
		return songList;
	}
	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}
	public Artist() {
		super();
	}
	public Artist(String name, String role, String gender, Date dob, List<Song> songList) {
		super();
		this.name = name;
		this.role = role;
		this.gender = gender;
		this.dob = dob;
		this.songList = songList;
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + ", role=" + role + ", gender=" + gender + ", dob=" + dob + ", songList="
				+ songList + "]";
	}
	static List<Artist> prefill()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		List<Artist> artistList=new ArrayList<Artist>();
		try {
			artistList.add(new Artist("Ed Sheeran", "singer", "male", sdf.parse("15-12-1990"), new ArrayList<Song>()));
			artistList.add(new Artist("Steve Mac", "singer", "male", sdf.parse("06-06-2000"), new ArrayList<Song>()));
			artistList.add(new Artist("Anirudh", "singer", "male", sdf.parse("12-12-1992"), new ArrayList<Song>()));
			artistList.add(new Artist("Adhi", "singer", "male", sdf.parse("24-04-1993"), new ArrayList<Song>()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return artistList;
		
	}
	
}
