package com.calculation;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "Calculator", targetNamespace = "http://com.calculation/")
public interface Calculator {

	@WebMethod(operationName = "add")
	public int add(int a, int b);
}