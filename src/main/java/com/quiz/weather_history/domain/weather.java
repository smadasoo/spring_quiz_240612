package com.quiz.weather_history.domain;

import java.time.LocalDate;

public class weather {
	private int id;
	private LocalDate date;
	private String weather;
	private String temperature;
	private String precipitation;
	private double windSpeend;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getPrecipitation() {
		return precipitation;
	}
	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}
	public double getWindSpeend() {
		return windSpeend;
	}
	public void setWindSpeend(double windSpeen) {
		this.windSpeend = windSpeend;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDate getUpdataedAt() {
		return updataedAt;
	}
	public void setUpdataedAt(LocalDate updataedAt) {
		this.updataedAt = updataedAt;
	}
	private LocalDate createdAt;
	private LocalDate updataedAt;
	