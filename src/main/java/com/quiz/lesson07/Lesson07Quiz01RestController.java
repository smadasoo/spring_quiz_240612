package com.quiz.lesson07;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.entity.CompanyEntity;

@RequestMapping("/lesson07/quiz01")
@RestController
public class Lesson07Quiz01RestController {

	@GetMapping("/save1")
	public CompanyEntity save1() {
		String name = "넥속";
		String business = "컨텐츠 게임";
		String scale = "대기업";
		String headcount = "3585명";
		
		return companyBO.saveCompany(name, business, scale, headcount);
	}
	@GetMapping("/save2")
	public CompanyEntity save2() {
		String name = "버블팜";
		String business = "여신 금융업";
		String scale = "대기업";
		String headcount = "6834명";
		
		return companyBO.saveCompany(name, business, scale, headcount);
	}
}
