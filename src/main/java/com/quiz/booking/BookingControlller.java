package com.quiz.booking;

import java.time.LocalDate;
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

import com.quiz.booking.BO.BookingBO;
import com.quiz.booking.domain.Booking;

@RequestMapping("/booking")
@Controller
public class BookingControlller {

	@Autowired
	private BookingBO bookingBO;
	// 예약 목록 보기
	// http://localhost:8080/booking-list-view
	@GetMapping ("/booking-list-view")
	public String bookingListView(Model model) {
		// data
		List<Booking> bookingList = bookingBO.getBookingList();
		
		// model에 담기
		model.addAttribute("bookingList", bookingList);
		return "booking/bookingList";
	}
	// 예약하기 화면
	@GetMapping ("/make-check-view")
	public String makeBookingView() {
		return "booking/makeBooking";
	}
	
	@ResponseBody
	@PostMapping ("/make-check")
	public String makeBooking(
			@RequestParam("name") String name,
			@RequestParam("date") LocalDate date,
			@RequestParam("day") int day,
			@RequestParam("headcount") int headcount,
			@RequestParam("phoneNumber") String phoneNumber) {
		
		// DB INSERT
		bookingBO.makeBooking(name, date, day, headcount, phoneNumber);
		
		// 성공 JSON
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("result", "성공");
		return "booking/makeBooking";
		}
}
	

