package com.materials.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterateDemo {

	public static void main(String[] args) {
		List<String> collegeNames=new ArrayList<>();
		collegeNames.add("SRM");
		collegeNames.add("KTVR KPET");
		collegeNames.add("KTVR KPET");
		//iterate with iterate() method
		Iterator<String> iterateObj=collegeNames.iterator();
		while(iterateObj.hasNext())
		{
			System.out.println(iterateObj.next());
		}

	}

}
