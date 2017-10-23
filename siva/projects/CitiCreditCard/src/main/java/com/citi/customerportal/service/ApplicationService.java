package com.citi.customerportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.customerportal.dao.ApplicationDao;
import com.citi.customerportal.model.CreditCard;
import com.citi.customerportal.model.Customer;
import com.citi.customerportal.model.LoginCredentials;

@Service
public class ApplicationService {

	@Autowired
	ApplicationDao applicantdao;

	public void setApplicantdao(ApplicationDao applicantdao) {
		this.applicantdao = applicantdao;
	}

	public void saveApplicant(Customer cust) {

		applicantdao.saveApplicant(cust);

	}

	public boolean activateCard(CreditCard creditCard) {
		if (applicantdao.activateCard(creditCard)) {

			return true;
		} else {
			return false;
		}
	}

	public boolean register(LoginCredentials login) {
		// TODO Auto-generated method stub
		return applicantdao.registerCustomer(login);
	}

	public CreditCard verifyCustomer(LoginCredentials login) {
		return applicantdao.verifyCustomer(login);
	}

}
