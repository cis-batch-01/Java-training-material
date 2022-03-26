package com.materials.collectiondemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> departments = new TreeSet<String>();
		departments.add("CSE");
		departments.add("AE");
		departments.add("ECE");
		departments.add("EEE");
		for (String dept : departments) {
			//TreeSet always Sorted ascending order
			System.out.println(dept);
		}
	}

}
