package com.sp.feelet.controller;

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
	
	@GetMapping(value = "/cigars")
	public ResponseEntity<List<Cigar>> test2(){
		return new ResponseEntity<List<Cigar>>(this.CigarService.findAll(), HttpStatus.OK);
	}
	
}
