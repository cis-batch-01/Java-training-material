package corejavasamples.collections;

import java.util.ArrayList;
import java.util.List;

public class SampleList {
	public static void main(String[] args) {
		
		List list1=new ArrayList();
		List list2=new ArrayList();
		list1.add(10);
		list1.add("manoj");
		list1.add(12.5);
		list1.add(true);
		list1.add('h');
		list2.add("manoj");
		list2.add(10);
		System.out.println(list1.remove("manoj"));
		System.out.println(list1);
	}

}
