package com.sp.feelet.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "SPEND")
@Getter @Setter
public class Spend {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
	
	@ManyToOne
	@JoinColumn(name = "cigar_id")
	private Cigar cigar;
	
	@Column(columnDefinition = "int(11) default 0")
	private Integer usedCount;
	
	@Column(columnDefinition = "DATETIME(2) default CURRENT_TIMESTAMP(2)")
	private LocalDateTime registDateTime;
	
}
