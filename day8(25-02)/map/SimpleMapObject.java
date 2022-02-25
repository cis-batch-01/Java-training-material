package corejavasamples.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class SimpleMapObject {
	public static void main(String[] args) {
		Map newMap=new TreeMap();
		
		newMap.put(1.5,"manoj" );
		newMap.put(10.5, "maoj johnson");
		newMap.put(2.5,1343);
		
		System.out.println(newMap);
	}
}
