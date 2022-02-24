package corejavasamples.collections;

import java.util.Comparator;

public class CourseNameComparator implements Comparator<Course> {

	public int compare(Course o1, Course o2) {
		
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
