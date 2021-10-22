package com.revature.controller;

import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class ArithmeticController {

	public ArithmeticService arithmeticService;
	
	public ArithmeticController() {
		this.arithmeticService = new ArithmeticService();
		
	}
	
	public Handler multiply = (ctx)-> { // creating lambda that can be passed around
		ctx.result("multiply lambda invoked");
		
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		
		ctx.result(arithmeticService.doMultiplication(number1String, number2String));
	};
	
	public void registerEndpoint(Javalin app) {
		app.post("/multiply", multiply); 
	}
}
