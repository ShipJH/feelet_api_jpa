package com.sp.feelet.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sp.feelet.entity.Cigar;
import com.sp.feelet.repository.CigarRepository;
import com.sp.feelet.service.CigarService;

@Service
public class CigarServiceImpl implements CigarService{

	private CigarRepository cigarRepository;
	
	public CigarServiceImpl(CigarRepository cigarRepository) {
		this.cigarRepository = cigarRepository;
	}
	
	@Override
	public List<Cigar> findAll() {
		return cigarRepository.findAll();
	}

}
