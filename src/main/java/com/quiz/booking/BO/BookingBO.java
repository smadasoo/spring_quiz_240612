package com.quiz.booking.BO;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.booking.domain.Booking;
import com.quiz.booking.mapper.BookingMapper;


@Service
public class BookingBO {

	// input : X
	// output : List<booking> 여러개일땐 무조건 List
	@Autowired
	private BookingMapper bookingMapper;
	
	public List<Booking> getBookingList() { // where절 업으면 by 안붙혀도 된다.
		return bookingMapper.selectBookingList();
	}
	
	// intput: id
	// output : int
	public int deleteBookingById(int id) {
		return bookingMapper.deleteBookingById(id);
	}
	
	// 정보 insert
	public void addBooking(String name, LocalDate date, int day, int headcount, String phoneNumber) {
		bookingMapper.insertBooking(name, date, day, headcount, phoneNumber); // bookingmapper에게 받아온 파라미터를 보낸다.
	}
	
	// 조회하기
	
	
}
