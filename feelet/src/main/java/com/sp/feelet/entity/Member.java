package com.sp.feelet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "MEMBER")
@Getter @Setter
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String userId;
	
//	@OneToMany(mappedBy = "member")
//	private List<Spend> spend = new ArrayList<>();
}
