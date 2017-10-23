package com.bcj.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.springboot.dao.StudentDao;
import com.bcj.springboot.entity.Student;


@Service
public class StudentService implements StudentServiceInterface{

	@Autowired 
	private StudentDao studentDao;

	
	public boolean addStudent( Student student) {
		
			
		boolean result =studentDao.addStudent(student);
		
		return result;
		

	}
}
