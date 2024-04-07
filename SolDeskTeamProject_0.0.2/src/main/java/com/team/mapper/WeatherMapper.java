package com.team.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.team.dto.shortwthr.Item;

@Repository
public interface WeatherMapper {
	public void weatherInsert(Item weatherEntiy);
	
	//전체 리스트 가져오기 
	public List<Item> weatherList(String area);

//	public List<Item> nowWeatherList(String area ,String fcstDate, String fcstTime);

	//현재 리스트 가져오기
	public List<Item> nowWeatherList(Map<String, Object> map);
	
	//검색어 리스트 가져오기
	public List<Item> searchWeather(Map<String, Object> map);
	
	//현재 검색어 리스트 가져오기
	
}
