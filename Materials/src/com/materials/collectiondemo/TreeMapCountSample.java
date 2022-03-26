package com.materials.collectiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCountSample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Manoj");
		names.add("Kannan");
		names.add("Kannan");
		names.add("Ramesh");
		names.add("Manoj");
		System.out.println(names);
		Map<String, Integer> nameCountMap = new TreeMap<String, Integer>();
		for(String name : names)
		{
			if(!nameCountMap.containsKey(name))
			{
				nameCountMap.put(name,1);
			}
			else
			{
				nameCountMap.put(name, nameCountMap.get(name)+1);
			}
		}
		System.out.println(nameCountMap);
	}
}
