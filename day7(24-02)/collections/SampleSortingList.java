package corejavasamples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleSortingList {
	public static void main(String[] args) {
		
		List<String> nameList=new ArrayList<String>();
		nameList.add("loganathan");
		nameList.add("yasin");
		nameList.add("arun");
		nameList.add("manoj");
		nameList.add("maonj");
		nameList.add("lavanya");
		Collections.sort(nameList); //sort the elements
		System.out.println(nameList);
	
	}

}
