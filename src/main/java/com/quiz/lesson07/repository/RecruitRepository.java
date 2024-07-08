package com.quiz.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer>{
	
	
	// jpqL => Entity에 조회
	// quiz-02번
	public List<RecruitEntity> findByCompanyId (int companyId);
	
	// quiz02 7번 - native query (DB에 직접 SQL)
	@Query(value = "select * from `recruit`"
			+ "where `deadline` > :deadline "
			+ "and `salary`  >= :salary "
			+ "and `type` = : type "
			+ "order by salart` desc"
			, nativeQuery = true)
	public List<RecruitEntity> findByDeadlineAndSalaryAndType(
			@Param("deadline") String deadline,
			@Param("salary") int salary,
			@Param("type") String type);
}
