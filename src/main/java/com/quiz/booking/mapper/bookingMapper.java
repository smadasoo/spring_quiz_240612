package com.quiz.booking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.booking.domain.booking;

@Mapper
public interface bookingMapper {

	public booking selectBooking();
	
	public List<booking> selectBookingList();
}
