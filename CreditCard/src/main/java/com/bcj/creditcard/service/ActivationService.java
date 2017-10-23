package com.bcj.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.creditcard.dao.ActivationDao;
import com.bcj.creditcard.entity.Login;



@Service
public class ActivationService {
	
    @Autowired  
	private ActivationDao activeDao;

	public ActivationDao getActiveDao() {
		return activeDao;
	}

	public void setActiveDao(ActivationDao activeDao) {
		this.activeDao = activeDao;
	}
	
	

	public String activateCard(Login login) {
		
				
		int result = activeDao.verifyCreditCard(login);

    	if(result==1)
		    return "error";
		else if (result ==2)
			return "active ";
		else 
			return "exist";
		
	} 
	
	
}
