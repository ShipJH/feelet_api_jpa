package com.sp.feelet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.feelet.entity.Spend;
import com.sp.feelet.repository.SpendRepository;
import com.sp.feelet.service.SpendService;

@Service
public class SpendServiceImpl implements SpendService{

	private SpendRepository spendRepository;
	
	@Autowired
	public SpendServiceImpl(SpendRepository spendRepository) {
		this.spendRepository = spendRepository;
	}
	
	@Override
	public List<Spend> list(Long memberId) {
		return this.spendRepository.findByMemberId(memberId);		
	}

}
