package com.materials.collectiondemo.sorting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortingComparatorDemo {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		List<MovieModel> movieList = new ArrayList<MovieModel>();
		try {
			movieList.add( new MovieModel("KGF", 250.0, sdf.parse("01-12-2021")));
			movieList.add(new MovieModel("RRR",300.0,sdf.parse("24-03-2022")));
			movieList.add(new MovieModel("Beast",200.0,sdf.parse("24-04-2022")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Movie List");
		System.out.println(movieList);
		Collections.sort(movieList,new MoviePriceComparator());
		System.out.println("Movie List after Sorting");
		System.out.println(movieList);
	}
}
class MoviePriceComparator implements Comparator<MovieModel>
{
	@Override
	public int compare(MovieModel movie1, MovieModel movie2) {
		//Double implements compareTo method
		return movie1.getPrice().compareTo(movie2.getPrice());
	}
	
}
class MovieModel
{
	private String name;
	private Double price;
	private Date releaseDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public MovieModel() {
		super();
	}
	public MovieModel(String name, Double price, Date releaseDate) {
		super();
		this.name = name;
		this.price = price;
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return "\nName=" + name + "\nPrice=" + price + "\nRelease Date=" + sdf.format(releaseDate) + "\n";
	}	
}
