package com.technocis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.technocis.model.Course;

public class CourseDAOImpl implements CourseDAO{

	static String selectAllCourses="select id,name,description,duration from course";
	static String selectCourse="select id,name,description,duration from Course where id=?";
	static String insertCourse="insert into Course (name,description,duration) values(?,?,?)";
	static String updateCourse="update course set name=?,description=?,duration=? where id=?";
	public Course getCourse(int id) {
		Course course=null;
		Connection con=ConnectionUtil.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(selectCourse);
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
			course=new Course(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return course;
	}

	public List<Course> getAllCourse() {
		List<Course> resList=new ArrayList();
		Connection con=ConnectionUtil.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(selectAllCourses);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			resList.add(new Course(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resList;
	}

	public Course saveCourse(Course course) {
		
		Connection con=ConnectionUtil.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(insertCourse);
			pstmt.setString(1, course.getName());
			pstmt.setString(2,course.getDesc());
			pstmt.setInt(3,course.getDuration());
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				return course;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public Course updateCourse(int id, Course course) {
		
		Connection con=ConnectionUtil.getDBConnect();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateCourse);
			pstmt.setString(1, course.getName());
			pstmt.setString(2, course.getDesc());
			pstmt.setInt(3, course.getDuration());
			pstmt.setInt(4, id);
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				return course;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Course deleteCourse(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
