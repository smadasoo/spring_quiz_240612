package com.quiz.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer>{
	
	
	// jpqL => Entity에 조회
	// quiz-02번
	public List<RecruitEntity> findByCompanyId (int companyId);
}
