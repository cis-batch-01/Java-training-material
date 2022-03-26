package com.materials.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("Manoj");
		names.add("Naresh");
		names.add("Pradeep");
		String name=new String("Kannan");
		names.add(name);
		names.add("Kannan"); //list accepts duplicates
		System.out.println(names);
		for (String string : names) {
			System.out.println(string);
		}
	}

}
