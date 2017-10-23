package com.bcj.soap.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcj.soap.dao.SoapDao;
import com.bcj.soap.entity.Address;

@WebService (serviceName = "demosoap" , endpointInterface="com.bcj.soap.service.SoapServiceInterface")
public class SoapServiceImplementation implements SoapServiceInterface{

	@Autowired
	SoapDao soapDao;
	


	public void setSoapDao(SoapDao soapDao) {
		this.soapDao = soapDao;
	}

	public String testing(Address addr) {
				
		return soapDao.testing(addr);
		
	}

	
}
