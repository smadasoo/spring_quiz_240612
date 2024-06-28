package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.domain.Bookmark;
import com.quiz.lesson06.mapper.BookmarkMapper;

@Service
public class BookmarkBO {
	
	@Autowired
	private BookmarkMapper bookmarkMapper;

	// input: X
	// output: List<Bookmark> 여러행이면 무조건 List
	public List<Bookmark> getBookmarkList() {
		return bookmarkMapper.selectBookmarkList();
	}
	
	// intput: name, url
	// output: X
	public void addBookmark(String name, String url) {
		bookmarkMapper.insertBookmark(name, url);
	}
	
	// input :  url 
	// output : boolean
	public boolean isDuplicationUrl (String url) {
		// 중복 [bookmark1, bookmark2]       중복 아님 :[]
		List<Bookmark> bookmarkList = bookmarkMapper.selectBookmarkListByUrl(url);
		return bookmarkList.isEmpty() ? false : true;
	}
	
	// input : id
	// output : x
	public int deleteBookmarkById(int id) {
		return bookmarkMapper.deleteBookmarkById(id);
	}
}	