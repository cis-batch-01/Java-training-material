package com.materials.collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> departments = new HashSet<>();
		departments.add("CSE");
		departments.add("ECE");
		departments.add("ece");
		departments.add("IT");
		departments.add("it");
		departments.add("EEE");
		departments.add("EEE");//set replaces the duplicates
		departments.add("EEE");
		//set doesn't maintain the insertion order
		for (String string : departments) {
			System.out.println(string);
		}
	}
}
