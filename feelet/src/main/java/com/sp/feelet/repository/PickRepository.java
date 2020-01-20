package com.sp.feelet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.feelet.entity.Pick;

@Repository
public interface PickRepository extends JpaRepository<Pick, Long>{

}
