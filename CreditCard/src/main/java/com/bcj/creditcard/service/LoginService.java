package com.bcj.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.creditcard.dao.LoginDao;
import com.bcj.creditcard.entity.Login;


@Service
public class LoginService {
	
	@Autowired
	private LoginDao loginDao;

	public void saveLogin(Login login) {
		
		loginDao.saveLogin();		
	
	}

	
	
	
	public int validateLogin(Login login) {
		return 1;
		
		
		
	}

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	
	
	
	
	

}
