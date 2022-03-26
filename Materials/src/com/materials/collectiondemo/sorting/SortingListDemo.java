package com.materials.collectiondemo.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListDemo {
	public static void main(String[] args) {
		List<String> movieList = new ArrayList<String>();
		movieList.add("Uncharted");
		movieList.add("KGF");
		movieList.add("Beast");
		movieList.add("Maaran");
		Collections.sort(movieList); //sort the list ascending 
		System.out.println(movieList);
		Collections.sort(movieList,Collections.reverseOrder()); //sort the list descending
		System.out.println(movieList);
	}
}
