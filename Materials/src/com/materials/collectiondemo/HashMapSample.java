package com.materials.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
	public static void main(String[] args) {
		// departmentName,count
		Map<String,Integer> deptCountMap = new HashMap<String, Integer>();
		deptCountMap.put("CSE", 50);
		deptCountMap.put("IT",45);
		deptCountMap.put("AE", 35);
		
		System.out.println(deptCountMap);
		for(String dept:deptCountMap.keySet())
		{
			Integer mark = deptCountMap.get(dept);
			System.out.println(dept+"-->"+mark);
		}
	}
}
