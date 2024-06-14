package com.quiz.lesson03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.lesson03.mapper.RealEstateMapper;

@RestController
@RequestMapping("/lesson03/quiz01")
public class Lesson03Quiz01RestController {
	
	@RequestMapping("/1")
	public RealEstate quzi01_1( 
		@RequestParam(value = "id")int id){

		return RealEstateMapper.selcetRealEstateById(id);
		}
	
	@RequestMapping("/2")
	public RealEstate quiz02_2
}


