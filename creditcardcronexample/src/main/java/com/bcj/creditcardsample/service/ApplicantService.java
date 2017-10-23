package com.bcj.creditcardsample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.creditcardsample.dao.ApplicantDao;
import com.bcj.creditcardsample.entity.Applicant;



@Service
public class ApplicantService {

	@Autowired
	private ApplicantDao applDao;
	
	
	public void getApplicant() {
		
		Applicant applicant = applDao.getApplicant();
		
		System.out.println(applicant);
	}


	public ApplicantDao getAppDao() {
		return applDao;
	}


	public void setAppDao(ApplicantDao applDao) {
		this.applDao = applDao;
	}

}
