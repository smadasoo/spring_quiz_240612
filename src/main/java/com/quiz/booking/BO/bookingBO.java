package com.quiz.booking.BO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.booking.domain.booking;
import com.quiz.booking.mapper.bookingMapper;

@Service
public class bookingBO {

	public List<booking> getBookingList(){
		return bookingMapper.selectBookingList();
	}
}
