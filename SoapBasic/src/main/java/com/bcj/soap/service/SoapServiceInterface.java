package com.bcj.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.bcj.soap.entity.Address;

@WebService(name = "demosoap")

@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface SoapServiceInterface {

	
	@WebMethod 
	public String testing(Address addr);
	
	
}
