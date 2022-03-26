package com.materials.collectiondemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> totalMarks = new LinkedList<Integer>();
		totalMarks.add(478);
		totalMarks.add(466);
		totalMarks.add(433);
		
		for (Integer integer : totalMarks) {
			System.out.println(integer);
		}
		System.out.println(totalMarks);//All the collection has the implements the toString method
	}

}
