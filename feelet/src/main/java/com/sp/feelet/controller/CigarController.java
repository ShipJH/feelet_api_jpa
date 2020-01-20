package com.sp.feelet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sp.feelet.entity.Cigar;
import com.sp.feelet.entity.Pick;
import com.sp.feelet.service.CigarService;

@Controller
public class CigarController {

	private CigarService CigarService;
	
	@Autowired
	public CigarController(CigarService cigarService) {
		this.CigarService = cigarService;
	}
	
	@GetMapping(value = "/cigars")
	public ResponseEntity<List<Cigar>> list(){
		return new ResponseEntity<List<Cigar>>(this.CigarService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/cigarPick")
	public ResponseEntity<?> registPick(){
		Pick result = this.CigarService.save();
		return ResponseEntity.status(result != null ? HttpStatus.OK : HttpStatus.NO_CONTENT).build();
	}
}
