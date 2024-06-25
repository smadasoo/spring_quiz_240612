package com.quiz.weather_history;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/weather-history")
@Controller
public class WeatherHistoryController {

	@GetMapping("/add-weather-view")
	public String add-weather-view(){
		return weather_history/addWeather;
	}
}
