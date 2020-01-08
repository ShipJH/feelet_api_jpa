package com.sp.feelet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sp.feelet.service.SpendService;

@Controller
public class SpendController {

	private SpendService spendService;
	
	@Autowired
	public SpendController(SpendService spendService) {
		this.spendService = spendService;
	}
	
	@GetMapping(value = "/test")
	public ResponseEntity<String> test() {
		
		return new ResponseEntity<String>("tetst", HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
