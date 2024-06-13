package com.quiz.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.domain.store;
import com.quiz.lesson02.mapper.storeMapper;

@Service  // spring bean
public class StoreBO {

	@Autowired
	private storeMapper storeMapper;
	
	// input: X 모든걸 다 받아와야해서 input은 없다
	// output: List<store>
	public List<store> getstoreList() { // get은 조회하다라는 뜻이다
//		List<Store> storeList = storeMapper.selectStoreList();
//		return storeList; // 컨트롤러한테 전달
		
		return storeMapper.selectStoreList();
	}
}
