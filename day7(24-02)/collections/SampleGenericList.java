package corejavasamples.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleGenericList {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();//generic list <>
		list.add("lotus");
		list.add("jasmin");
		list.add("rose");
		list.add("lilly");
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).equals("jasmin"))
//			{
//			System.out.println(list.get(i)+" is my favarote");
//			}
//		}
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println(list);
	}

}
