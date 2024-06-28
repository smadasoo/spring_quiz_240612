package com.quiz.booking;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/booking")
@Controller
public class BookingControlller {

	// 예약 목록 보기
	// http://localhost:8080/booking-list-view
	@GetMapping ("/booking-list-view")
	public String bookingListView() {
		return "booking/bookingList";
	}
	
}
