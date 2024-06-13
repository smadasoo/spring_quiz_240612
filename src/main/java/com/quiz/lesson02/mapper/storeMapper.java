package com.quiz.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson02.domain.store;

@Mapper
public interface storeMapper {

	public List<store> selectStoreList();
}
