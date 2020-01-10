package com.sp.feelet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sp.feelet.entity.Spend;
import com.sp.feelet.service.SpendService;

@Controller
public class SpendController {

	private SpendService spendService;
	
	@Autowired
	public SpendController(SpendService spendService) {
		this.spendService = spendService;
	}
	
	@GetMapping(value = "/spend/{memberId}")
	public ResponseEntity<List<Spend>> list(@PathVariable Long memberId) {
		return new ResponseEntity<List<Spend>>(this.spendService.list(memberId), HttpStatus.OK);
		
	}
	
}
