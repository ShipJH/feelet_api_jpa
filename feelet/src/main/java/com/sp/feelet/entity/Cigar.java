package com.sp.feelet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "CIGAR")
@Getter @Setter
public class Cigar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String image;
	
	@Column(nullable = false)
	private Integer price;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "varchar(255) default 'WESTERN'")
	private MadeOrigin madeOrigin;
	
	@Column(nullable = false)
	private Double nicotine;
	
	@Column(nullable = false)
	private Double tar;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "varchar(255) default 'CIGAR'")
	private CigarType type; 
	
	@ColumnDefault(value = "20")
	private Integer count;
	
//	@OneToMany(mappedBy = "cigar" , fetch = FetchType.LAZY)
//	private List<Spend> spend = new ArrayList<>();
	
}

enum CigarType{
	CIGAR,
	HEETS,
	FIIT,
	LIQUID
}

enum MadeOrigin{
	KOREA,
	JAPAN,
	WESTERN 
}