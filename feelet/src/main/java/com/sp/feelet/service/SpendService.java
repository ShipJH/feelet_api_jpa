package com.sp.feelet.service;

import java.util.List;

import com.sp.feelet.entity.Spend;

public interface SpendService {

	List<Spend> list(Long memberId);

}
