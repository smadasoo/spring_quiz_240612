package com.quiz.lesson07.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name= "recruit")
@Entity
public class recruitEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "companyId")
	private int companyId;
	
	private String position;
	
	private String responsibilities;
	
	private String qualification;
	
	private String type;
	
	private String region;
	
	private String salary;
	
	private String deadline;
	
	@CreationTimestamp // 시간을 넣기 않아도 자동으로 넣어줌
	@Column(name = "createdAt");
	private createdAt createdAt;
	
	@UpdateTimestamp
	@Column(name = "updatedAt");
	private updatedAt updatedAt;
}