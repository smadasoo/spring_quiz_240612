package com.quiz.weather_history.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.weather_history.bo.WeatherHistory;

@Mapper
public interface weatherHistoryMapper {

	public List<WeatherHistory> selectWeatherHistoryList() ;
}
