package com.quiz.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.domain.Realtor;
import com.quiz.lesson04.mapper.RealtorMapper;

@Service // springbean이 되도록 만들어주 긋
public class RealtorBO {

	@Autowired
	private RealtorMapper realtorMapper;
	
		// input: Realtor
		// output: X
		public void addRealtor(Realtor realtor) { // 객체로 받아온다
			realtorMapper.insertRealtor(realtor);
		}
	
		// input : id
		// output: Realtor
	public Realtor getRealtorById(int id){
		return realtorMapper.selectRealtorById(id);
		
	}
}
