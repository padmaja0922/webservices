package com.bcj.soapexample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Course {

	@Id
	@GeneratedValue
	private int cId;
	private String courseName;
	private String courseDesc;
	
	public int getcId() {
		return cId;
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", courseName=" + courseName + ", courseDesc=" + courseDesc + "]";
	}
	
	
	
	
}
