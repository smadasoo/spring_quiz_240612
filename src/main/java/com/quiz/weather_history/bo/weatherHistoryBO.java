package com.quiz.weather_history.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class weatherHistoryBO {

	// input: X
	// output: List<WeatherHistory>
	@Autowired
	private WeatherHistoryMapper weatherHistoryMapper;
	
	public List<WeatherHistory> getWeatherHistoryList(int id) {
		return WeatherHistoryMapper.selectweatherHistoryMapper();
	}
	
}
