package com.sp.feelet.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sp.feelet.entity.Cigar;
import com.sp.feelet.service.CigarService;

@Controller
public class CigarController {

	private CigarService CigarService;
	
	@Autowired
	public CigarController(CigarService cigarService) {
		this.CigarService = cigarService;
	}
	
	@GetMapping(value = "/test")
	public ResponseEntity<List<String>> test() {
		
		List<String> abc = Arrays.asList("ABC","DEF","GHI");
		
		return new ResponseEntity<List<String>>(abc, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getList")
	public ResponseEntity<List<Cigar>> test2(){
		return new ResponseEntity<List<Cigar>>(this.CigarService.findAll(), HttpStatus.OK);
	}
	
}
