package com.quiz.lesson07.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name= "company")
@Getter
@builder
@NoArgsConstructor
@AllArgsConsrutor
@ToString
public class CompanyEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String business;
	private String scale;
	private String headcount;
	
	@Column
	private LocalDateTime createdAt;
	
	@Column
	private LocalDateTime updatedAt;
}
