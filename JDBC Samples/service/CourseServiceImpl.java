package com.technocis.service;

import java.util.List;

import com.technocis.dao.CourseDAO;
import com.technocis.dao.CourseDAOImpl;
import com.technocis.model.Course;

public class CourseServiceImpl implements CourseService {

	static CourseDAO courseDao=new CourseDAOImpl();
	
	public Course getCourse(int id) {
		
		return courseDao.getCourse(id);
	}

	public List<Course> getAllCourse() {
		
		return courseDao.getAllCourse();
	}

	public Course saveCourse(Course course) {
		
		return courseDao.saveCourse(course);
	}

	public Course updateCourse(int id, Course course) {
		
		return courseDao.updateCourse(id,course);
	}

	public Course deleteCourse(int id) {
		
		return courseDao.deleteCourse(id);
	}

}
