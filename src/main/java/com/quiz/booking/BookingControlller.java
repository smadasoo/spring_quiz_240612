package com.quiz.booking;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.booking.BO.BookingBO;
import com.quiz.booking.domain.Booking;

@RequestMapping("/booking")
@Controller
public class BookingControlller {

	@Autowired
	private BookingBO bookingBO;
	// 예약 목록 보기-list-view
	@GetMapping ("/booking-list-view")
	// http://localhost:8080/booking-view
	public String bookingListView(Model model) {
		// db select 
		List<Booking> bookingList = bookingBO.getBookingList();
		
		// model에 담기
		model.addAttribute("bookingList", bookingList);
		
		return "booking/bookingList";
	}
	// AJAX - 예약 ID로 삭제
	@ResponseBody
	@DeleteMapping("/delete-booking")
	public Map<String, Object> deleteBooking(
			@RequestParam("id") int id) {
		
		// db delete
		int rowCount = bookingBO.deleteBookingById(id);
		
		// 응답값
		Map<String, Object> result = new HashMap<>();
		if (rowCount > 0) {
			result.put("code", 200);
			result.put("result", "성공");
		} else {
			result.put("code", 500);
			result.put("error_message", "삭제할 데이터가 없습니다.");
		}
		
		return result;
	}
	// 예약하기 화면
	@GetMapping ("/make-booking-view")
	public String makeBookingView() {
		return "booking/makeBooking";
	}
	
	// AJAX 요청 - addㅇㅖ약
	@ResponseBody
	@PostMapping("/make-booking")
	public Map<String, Object> makeBooking(
			@RequestParam("name") String name,
			@RequestParam("date") LocalDate date, // String도 된다잉
			@RequestParam("day") int day,
			@RequestParam("headcount") int headcount,
			@RequestParam("phoneNumber") String phoneNumber) {
		
		// DB INSERT
		bookingBO.addBooking(name, date, day, headcount, phoneNumber);
		
		
		// 응답값 성공 JSON 
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("result", "성공");
		return result;
	}
	
	// 예약확인 화면
	// http://localhost:8080/check-booking-view
	@ResponseBody
	@PostMapping ("/check-booking")
		public Map<String, Object>String checkBookingView() {
			return "booking/checkBooking";
		}
		
		// AJAX 요청 - 예약 조회
		@ResponseBody
		@PostMapping("/check-booking")
		public Map<String, Object> checkBooking(
				@RequestParam("name") String name,
				@RequestParam("phoneNumber") String phoneNumber) {
			
			// db select
			
			// 응답값 => JSON
			Map<String, Object> result = new HashMap<>();
			
			return result;
		}
}
	

