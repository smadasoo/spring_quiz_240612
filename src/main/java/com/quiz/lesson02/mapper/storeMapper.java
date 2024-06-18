package com.quiz.lesson02.mapper;

import java.util.List;

import org.apache.catalina.Store;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreMapper {
	
	// input: X
	// output: List<Store>
	public List<Store> selectStoreList();
}