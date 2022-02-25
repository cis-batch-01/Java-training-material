package corejavasamples.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SampleSet {
	public static void main(String[] args) {
		Set collectionSet=new TreeSet();
		
		collectionSet.add("manoj");
		collectionSet.add("qweetty");
		collectionSet.add("apple");
		for(Object obj:collectionSet)
		{
			
			System.out.println(obj);
			
		}
		//System.out.println(collectionSet);
	}

}
