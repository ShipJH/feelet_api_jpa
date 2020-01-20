package com.sp.feelet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.feelet.commonCode.CommonCode;
import com.sp.feelet.entity.Cigar;
import com.sp.feelet.entity.Member;
import com.sp.feelet.entity.Pick;
import com.sp.feelet.repository.CigarRepository;
import com.sp.feelet.repository.PickRepository;
import com.sp.feelet.service.CigarService;

@Service
public class CigarServiceImpl implements CigarService{

	private CigarRepository cigarRepository;
	private PickRepository pickRepository; 
	
	@Autowired
	public CigarServiceImpl(CigarRepository cigarRepository, PickRepository pickRepository) {
		this.cigarRepository = cigarRepository;
		this.pickRepository = pickRepository;
	}
	
	
	
	
	@Override
	public List<Cigar> findAll() {
		return cigarRepository.findAll();
	}

	
	//TODO : 추후에 파라미터 인자로 넘겨받고 일단은 저장 테스트를 위해 구현부 구현.
	@Override
	public Pick save() {
				return this.pickRepository.save(Pick.builder().member(Member.builder().id(1L).build())
															  .cigar(Cigar.builder().id(1L).build())
															  .useYn(CommonCode.YesNo.YES)
															  .build());
	}



}
