package com.quiz.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.bo.CompanyBO;
import com.quiz.lesson07.entity.CompanyEntity;

@RequestMapping("/lesson07/quiz01")
@RestController
public class Lesson07Quiz01RestController {

	@Autowired
	private CompanyBO companyBO;
	@GetMapping("/save1")
	public String save1() {
		String name = "넥손";
		String bussiness = "컨텐츠 게임";
		String scale = "대기업";
		int headcount = 3585;
		
		CompanyEntity company = companyBO.saveCompany(name, bussiness, scale, headcount);
		String str = "회사명 : " + company.getName()
								+ company.getBussiness()
								+ company.getScale()
								+ company.getHeadcount() + "명";
		return str;
	}
//	@GetMapping("/save2")
//	public CompanyEntity save2() {
//		String name = "버블팜";
//		String bussiness = "여신 금융업";
//		String scale = "대기업";
//		String headcount = "6834명";
//		
//		CompanyEntity company1 = companyBO.saveCompany(name, busssiness, scale, headcount);
//		
//		String str1 = "회사명 "+ company.getName()
//							+ company.getBussiness()
//							+ company.getScale()
//							+ company.getHeadcount();
//		return str1
//	}
}
