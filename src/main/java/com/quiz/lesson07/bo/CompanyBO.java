package com.quiz.lesson07.bo;

@service
public class CompanyBO {

	public CompanyEntity saveCompany(String name, String business,
			String scale, String headcount) {
		
		CompanyEntity company = CompanyEntity.builer()
				.name(name)
				.business(business)
				.scale(scale)
				.headcount(headcount)
				.createdAt(createdAt)
				.build();
	}
	
}
