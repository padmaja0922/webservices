package com.bcj.soapexample.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.bcj.soapexample.entity.Course;

@WebService(name = "SoapExample")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)

public interface CourseServiceInterface {
	@WebMethod
	public int saveCourse(Course course);

	@WebMethod
	public Course getCourseById(int id);

	@WebMethod
	public List<Course> getAllCourses();

	@WebMethod
	public String updateCourseById(Course course,int Id);

	@WebMethod
	public String deleteCourseById(int id);

}
