package com.quiz.lesson07.entity;

import java.time.LocalDateTime;

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

@Entity
@Table(name= "company")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CompanyEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String bussiness;
	private String scale;
	
	@Column(name = "headcount")
	private int headcount;
	
	@CreationTimestamp
	@Column (name = "createdAt")
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	@Column (name = "updatedAt")
	private LocalDateTime updatedAt;
}
