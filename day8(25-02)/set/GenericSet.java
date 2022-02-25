package corejavasamples.collections.set;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.TreeSet;

public class GenericSet {
	public static void main(String[] args) {
		
		Set<Double> genSet=new TreeSet<Double>();
		genSet.add(45.5555);
		genSet.add((double) 100000);
		genSet.add((double) 10);
		
		System.out.println(genSet);
		
	}

}
