package com.materials.collectiondemo.sorting.streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Movie{
	public String title;
	public Integer ratings;
	public Integer year;
	
	public Movie(String title, Integer ratings, Integer year) {
		this.title = title;
		this.ratings = ratings;
		this.year =  year;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", ratings=" + ratings + ", year=" + year + "]";
	}
	
	
}
public class TestMovieList {

	public static void main(String[] args) {
		
		//select title,rating,release_year from movies; ==> It will return 3 records
		//insert into movies (title,rating,release_year) values ('Kabali',4,2020);
		//insert into movies (title,rating,release_year) values ('Robo',3,2010);
		//insert into movies (title,rating,release_year) values ('Basha',5,2000);
		List<Movie> movieList = new ArrayList<Movie>();
		Movie m1 = new Movie("Kabali", 4,2020);
		Movie m2 = new Movie("Robo", 3, 2010);
		Movie m3 = new Movie("Basha", 5, 2000);
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);

		System.out.println("##### 1. Display All Movies ######");
		for (Movie movie : movieList) {
			System.out.println("Title:" + movie.title + ",ratings=" + movie.ratings + ",Year=" + movie.year );	
		}
		
		System.out.println("##### 2. Display Movies released after 2010 ######");
		//select * from movies where year >= 2010;
		List<Movie> filteredMovies = movieList.stream().filter(m-> m.year >=2010)
				.collect(Collectors.toList());
		System.out.println(filteredMovies);
		
		System.out.println("##### 3. Display Movie names ######");
		//select name from movies;
		List<String> movieNameList = movieList.stream().map(m-> m.title)
				.collect(Collectors.toList());
		System.out.println(movieNameList);
		
		System.out.println("##### 4. Display Movie names released after 2010 ######");
		//select name from movies where year >= 2010;		
		List<String> filteredMovieNameList = movieList.stream().
				filter(m-> m.year >=2010).map(m-> m.title)
				.collect(Collectors.toList());
		System.out.println(filteredMovieNameList);
	}
}
