package com.quiz.weather_history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/weather-history")
@Controller
public class WeatherHistoryController {

	@Autowired
	private WeatherHistoryBO weatherHistotyBO;
	
//	controller가 가져오지 않음 bo가 DB를 가져온다
	// 날씨 목록 화면 /weather-history/weather-list-view
	@GetMapping("/weather-list-view")
	public String weatherListView(Model model){
		// selelct db
		
		// model담기
		
		// 화면 이동
		return "weather_history/weatherList";
	}
	
	// 날씨 추가 화면 /weather-history/add-weather-view
	@GetMapping("/add-weather-view")
	public String addWeatherView() {
		return "weather_history/addWeather";
	}
	// 날씨를 보내는 것이 아닌 보여주기만 하는것임
	// 날씨 추가 기능 / weather-history/add-weather
	@postMapping("/add-weather")
	public String addWeather(
			@RequestParam("data") 타입) {
		
	}
}

