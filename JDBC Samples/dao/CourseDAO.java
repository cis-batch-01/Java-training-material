package com.technocis.dao;

import java.util.List;

import com.technocis.model.Course;

public interface CourseDAO {
	
	//1.getCourse
	public Course getCourse(int id);
	//2.getAllCourses
	public List<Course> getAllCourse();
	//3.saveCourse
	public Course saveCourse(Course course);
	//4.update 
	public Course updateCourse(int id,Course course);
	//5.delete
	public Course deleteCourse(int id);

}
