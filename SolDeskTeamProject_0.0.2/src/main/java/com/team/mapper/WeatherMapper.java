package com.team.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.team.dto.shortwthr.Item;

@Repository
public interface WeatherMapper {
	public void weatherInsert(Item weatherEntiy);
	
	public List<Item> weatherList(String area);

	public List<Item> nowWeatherList(String area ,String fcstDate, String fcstTime);
	
	
}
