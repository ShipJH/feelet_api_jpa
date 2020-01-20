package com.sp.feelet.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.sp.feelet.commonCode.CommonCode;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "PICK")
@Getter @Setter @Builder
public class Pick {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
	
	@ManyToOne
	@JoinColumn(name = "cigar_id")
	private Cigar cigar;
	
	@Column
	private CommonCode.YesNo useYn;
	
	@CreationTimestamp
	private LocalDateTime registDateTime;
	
	
}
