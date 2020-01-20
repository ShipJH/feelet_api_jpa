package com.sp.feelet.service;

import java.util.List;

import com.sp.feelet.entity.Cigar;
import com.sp.feelet.entity.Pick;

public interface CigarService {

	List<Cigar> findAll();
	Pick save();

}
