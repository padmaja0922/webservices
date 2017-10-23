package com.calculation;

import javax.jws.*;

@WebService(portName = "CalculatorPort", serviceName = "CalculatorService", targetNamespace = "http://com.calculation/", endpointInterface = "com.calculation.Calculator")
public class CalculatorImpl implements Calculator {

	public int add(int a, int b) {
		return a+b;

	}
}
