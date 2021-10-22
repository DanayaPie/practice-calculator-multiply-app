package com.revature.service;

public class ArithmeticService {

	public String doMultiplication(String number1String, String number2String) {
		
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);
		
		double multiply = number1 * number2;
		
		String result = "" + multiply;
		
		return result;
	}
}
