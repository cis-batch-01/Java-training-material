package corejavasamples.collections.map;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountMapSample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> courseCountMap = new TreeMap<String, Integer>(); // key-courseName
																				// value-count
		char choice = 'n';
		do {
			System.out.println("Enter the courseName");
			String courseName = scan.nextLine();
			if (courseCountMap.containsKey(courseName)) {
				int value = courseCountMap.get(courseName);
				courseCountMap.put(courseName, value + 1);
			} else {
				courseCountMap.put(courseName, 1);
			}
			System.out.println("Do you want to continue(y/n)");
			choice = scan.nextLine().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		System.out.println(courseCountMap);

		// Set<String> courseNameSet=courseCountMap.keySet();
		// List<Integer> count=(List<Integer>) courseCountMap.values();

		for (Entry<String, Integer> entry : courseCountMap.entrySet()) {
			if (entry.getKey().equals("c")) {
				System.out.println(entry.setValue(10));
			}
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}

	}

}
