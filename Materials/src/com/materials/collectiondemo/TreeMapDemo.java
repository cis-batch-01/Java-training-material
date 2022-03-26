package com.materials.collectiondemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> depCountMap = new TreeMap<String, Integer>();
		depCountMap.put("CSE", 45);
		depCountMap.put("AE", 35);
		depCountMap.put("IT", 55);
		System.out.println(depCountMap);
		//TreeMap maintains sorted keys
		for(String dept:depCountMap.keySet())
		{
			Integer count = depCountMap.get(dept);
			System.out.println(dept+"-->"+count);
		}
	}
}
