package com.bcj.soapexample.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcj.soapexample.dao.CourseDao;
import com.bcj.soapexample.entity.Course;


@WebService (serviceName = "SoapExample" , endpointInterface="com.bcj.soapexample.service.CourseServiceInterface")
public class CourseServiceImp implements CourseServiceInterface {
	
	@Autowired
	CourseDao courseDao;
	

	public int saveCourse(Course course) {
		
	 return	courseDao.saveCourse(course);
	
	}

	public Course getCourseById(int id) {		
		
		return courseDao.getCourseById(id);
	}

	public List<Course> getAllCourses() {
		
		List<Course> courseList = new ArrayList<Course>();
		
		 courseList = courseDao.getAllCourses();
		 return courseList;
	}

	public String updateCourseById( Course course , int id) {
		
		return courseDao.updateCourseById(course,id);
	}

	public String deleteCourseById(int id) {
		
		return courseDao.deleteCourseById(id);
	}

}
