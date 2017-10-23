package com.bcj.soapexample.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcj.soapexample.entity.Course;

@Repository
@Transactional
public class CourseDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	// save new course

	public int saveCourse(Course course) {

		Session session = sessionFactory.getCurrentSession();
		if (course != null)
			session.persist(course);

		return course.getcId();

	}

	// get Course details by id

	public Course getCourseById(int id) {

		Session session = sessionFactory.getCurrentSession();
		course = (Course) session.get(Course.class, id);

		return course;
	}

	// Getting all courses 
	
	@SuppressWarnings("unchecked")
	public List<Course> getAllCourses() {
		Session session = sessionFactory.getCurrentSession();
		
		List<Course> courseList = new ArrayList<Course>();
		
		courseList = (ArrayList<Course>) session.createQuery("from Course").list();
		
		return courseList;
	}

	// delete course by id
	
	public String deleteCourseById(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		course = (Course) session.get(Course.class, id);
		
		if(course != null)
		{
			session.delete(course);
			return "Success " ;
			
		}
		else
		  return "Invalid Id";
	}

	public String updateCourseById(Course cou, int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		course = (Course) session.get(Course.class, id);
		
		if(course != null)
		{
			session.update(cou);
			return "Success " ;
			
		}
		else
		  return "Invalid Id";
	}

}
