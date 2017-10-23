package com.bcj.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bcj.springboot.entity.Student;

@Repository
@Transactional
public class StudentDao {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	public boolean addStudent(Student student) {
		

		entityManager.persist(student);
		System.out.println("true");
		return true;
		
				
	}

	public boolean studentExists(int studentId) {
		
		String hql = "FROM Student WHERE  Student.StudentId= ?";
		
		int count = entityManager.createQuery(hql).setParameter(1, studentId).getResultList().size();
		return count > 0 ? true : false;
		
	}
	

}
