package com.BalajiIT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@GetMapping("/home")
	public String home() {
		
	String msg="Welcome to Bank";
	return msg;
	
	}
	@GetMapping("/check")
	public String checkBalance() {	
	String msg="Your Balance is : 50000 rs";
	return msg;
	
	}
	@GetMapping("/getStatement")
	public String getStatement() {
		String msg="Your Statement sent on your email";
		return msg;
	}

	@GetMapping("/getLoan")
	public String getLoan() {
		String msg="Your Loan Approvel";
		return msg;
	}

	@GetMapping("/contact")
	public String getContact() {
		String msg="Your contact no : 7798562040";
		return msg;
	}
}
