package com.quiz.lesson06.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson06.domain.Bookmark;

@Mapper
public interface BookmarkMapper {

	public Bookmark selectBookmark();
}
