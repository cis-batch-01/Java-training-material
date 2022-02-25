package corejavasamples.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class GenericMap {
	public static void main(String[] args) {
		Map<Integer,String> monthNamerMap=new TreeMap<Integer, String>();
		
		monthNamerMap.put(1, "january");
		monthNamerMap.put(2, "february");
		monthNamerMap.put(3, "march");
		monthNamerMap.put(4, "April");
		monthNamerMap.put(5, "may");
		monthNamerMap.put(6, "june");
		monthNamerMap.put(7, "july");
		if(!monthNamerMap.containsKey(8))
		{
		monthNamerMap.put(8, "august");
		}
		
		System.out.println(monthNamerMap.get(8));
		
		
	}

}
