package com.sp.feelet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.feelet.entity.Cigar;

@Repository
public interface CigarRepository extends JpaRepository<Cigar, Long>{

}
