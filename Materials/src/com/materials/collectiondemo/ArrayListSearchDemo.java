package com.materials.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSearchDemo {
	public static void main(String[] args) {
		List<String> departmentNames=new ArrayList<String>();
		departmentNames.add("CSE");
		departmentNames.add("ECE");
		departmentNames.add("IT");
		departmentNames.add("EEE");
		//Approach 1 :
		String dept="CSE";
		boolean isExist=false;
		for (String string : departmentNames) {
			System.out.println(string);
			if(string.equals(dept))
			{
				isExist=true;
			}
		}
		System.out.println("Value "+dept+" Exists in the Collection "+ isExist);
		//Approach 2: with build in method
		isExist = departmentNames.contains(dept);
		System.out.println("Value "+dept+" Exists in the Collection "+ isExist);
		
	}
}
