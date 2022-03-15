package com.jdbcsample.coursesample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.technocis.model.Course;
import com.technocis.service.CourseService;
import com.technocis.service.CourseServiceImpl;

public class CourseTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.get a Course\n2.Get All course\n3.Create Course\n4.update Course\n5.DeleteCourse");
		int choice=Integer.parseInt(br.readLine());
		CourseService courseService=new CourseServiceImpl();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the id to fetch");
			int id=Integer.parseInt(br.readLine());
			Course course=courseService.getCourse(id);
			System.out.println(course);
			break;
		case 2:
			List<Course> courseList=courseService.getAllCourse();
			for(Course element:courseList)
			{
				System.out.println(element);
			}
			break;
		case 3:
			System.out.println("Enter the course details");
			String detail=br.readLine();
			String datas[]=detail.split(",");
			Course newCourse=new Course( datas[0], datas[1], Integer.parseInt(datas[2]));
			Course insertedCourse=courseService.saveCourse(newCourse);
			System.out.println(insertedCourse!=null?"Course data inserted\n"+insertedCourse:"Course Not Inserted");
			break;
		case 4:
			System.out.println("Enter the id to update");
			int updateId=Integer.parseInt(br.readLine());
			Course oldCourse =courseService.getCourse(updateId);
			System.out.println(oldCourse);
			System.out.println("Enter the course details");
			String updateDetail=br.readLine();
			String updateDatas[]=updateDetail.split(",");
			Course UpdatedCourse=new Course( updateDatas[0], updateDatas[1], Integer.parseInt(updateDatas[2]));
			Course resCourse=courseService.updateCourse(updateId, UpdatedCourse);
			System.out.println(resCourse!=null?"Course data updated\n"+resCourse:"Course Not Updated");
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
