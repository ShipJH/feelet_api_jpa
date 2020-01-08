package com.sp.feelet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.feelet.entity.Spend;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long>{

}
