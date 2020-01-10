package com.sp.feelet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.feelet.entity.Spend;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long>{

	List<Spend> findByMemberId(Long memberId);

}
