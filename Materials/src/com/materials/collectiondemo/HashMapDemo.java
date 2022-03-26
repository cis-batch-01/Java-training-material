package com.materials.collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> nameMarkMap = new HashMap<String, Integer>();
		nameMarkMap.put("Manoj", 433);
		nameMarkMap.put("Pradeep", 454);
		nameMarkMap.put("Loganathan", 445);
		//hash map doesn't maintains the insertion order
		System.out.println(nameMarkMap);
		//prints the key - extract the keys as set keyset()
		for(String name:nameMarkMap.keySet())
		{
			System.out.println(name);
		}
		//prints the value - extract the values as List values()
		for(Integer mark: nameMarkMap.values())
		{
			System.out.println(mark);
		}
		//using entry class   entrySet returns a Set<Entry<String,name>>
		System.out.println("Name =\t mark");
		for(Entry<String,Integer> entry:nameMarkMap.entrySet())
		{
			System.out.println(entry.getKey()+" =\t"+entry.getValue());
		}
	}
}
