package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.lesson06.bo.BookmarkBO;
import com.quiz.lesson06.domain.Bookmark;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {

	@Autowired
	BookmarkBO bookmarkBO;
	// 즐겨찾기 추가 화면
	//http://localhost/lesson06/add-bookmark-view
	@GetMapping ("/add-bookmark-view")
	public String addBookMarkView() {
		return "lesson06/addBookmark";
	}
	
	// AJAX 가 하는 요청
	// 즐겨찾기 추가 로쥑
	@ResponseBody 
	@PostMapping("/add-bookmark")
	
	// 지금 스트링은 성공에 의한 것이다
	public Map<String, Object> addBookmark(
			@RequestParam("name") String name,
			@RequestParam("url") String url) {
		
		// db insert 아직은 안한일 TODO
		bookmarkBO.addBookmark(name, url);
			
		// 성공 JSON
		// {"code":200, "result":"성공"}
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("result", "성공");
		
		// 요청을 하고 switch문이 실행 되었다면 404는 지나간것
		return result; // JSON String 
	}
	
	// 즐겨찾기 목록 화면 
	@GetMapping("/bookmark-list-view")
	public String bookmarkListView(Model model) {
		// db select => List<Bookmark)
		List<Bookmark> bookmarkList = bookmarkBO.getBookmarkList();
		
		// model 담기 
		model.addAttribute("bookmarkList", bookmarkList);
		return "lesson06/bookmarkList";
	}
}
