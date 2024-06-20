package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.bo.RealtorBO;
import com.quiz.lesson04.domain.Realtor;

@RequestMapping("/lesson04/quiz02")
@Controller
public class Lesson04Quiz02Controller {

	
	@Autowired
	private RealtorBO  realtorBO;
	
//	/add-realtor-view
	// 회원 가입 화면
	@GetMapping("/add-realtor-view")
	public String addRealtorView() { // 어떤 데이터도 뿌리지 않는 마크없만 하는 화면이기에 문자를 쓴다 즉 String
		return "lesson04/addRealtor";
	}
	// DB insert, select =>  방금 가입된 학생 => 화면
	@PostMapping("/add-realtor")
	public String addRealtor(
			@ModelAttribute Realtor realtor,
			Model model) {
		
	// DB insert BO에서 실행
	realtorBO.addRealtor(realtor);
	
	// id를 가지고 DB select
	Realtor latestRealtor = realtorBO.getRealtorById(realtor.getId());	
	
	// model을 사용하는 건 controller이다
	// Model에 데이터를 담는다.
	model.addAttribute("realtor", latestRealtor);
		

	// 화면 이동 (html 우리가 보는 화면으로 이동)
	return "lesson04/afterAddRealtor";
	
	}
	
	
	
	
}
