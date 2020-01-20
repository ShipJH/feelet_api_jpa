package com.sp.feelet.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "MEMBER")
@Getter @Setter @Builder
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String userId;
	
	@CreationTimestamp
	private LocalDateTime registDateTime;
	
	@UpdateTimestamp
	private LocalDateTime updateDateTime;
	
//	@OneToMany(mappedBy = "member")
//	private List<Spend> spend = new ArrayList<>();
}
