package com.quiz.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.lesson03.mapper.RealEstateMapper;

@Service
public class RealEstateBO {

	@Autowired
	private RealEstateMapper realEstateMapper;
	
	
	// input: id(int)
	// output: RealEstate(단건) or null
	public RealEstate getRealEstateById(int id) {
		return RealEstateMapper.selcetRealEstateById(id);
	}
	
	public RealEstate getRealEstateListByRentPrice(int rentPrice) {
		return RealEstateMapper.selcetRealEstateById(rentPrice);
	}
}
