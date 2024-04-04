package com.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team.service.WeatherAsosService;
import com.team.service.WeatherLivingService;
import com.team.service.WeatherMediumService;
import com.team.service.WeatherShortService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/Weather/*")
@AllArgsConstructor
@Controller
public class BoardContorller {
	
	@Autowired
	private WeatherMediumService mediumService;
	private WeatherLivingService livingService;
	private WeatherAsosService asosService;
	private	WeatherShortService shortService;
	
	//메인 컨트롤러
	@GetMapping("/Main")
	public void test(@RequestParam("area") String area,Model model){
		log.info("컨트롤러테스트");
		System.out.println("컨트롤러테스트");
		model.addAttribute("air",livingService.livingWeatherRun(area));
		model.addAttribute("uv",livingService.livingWeatherUVRun(area));
		model.addAttribute("asos",asosService.asosDalyInfoRun(area));
	}
	
	//중기 컨트롤러
	@GetMapping("/MediumWeather")
	public void Medium(@RequestParam("area") String area,Model model) {
		System.out.println("미디움테스트");
		model.addAttribute("temper",mediumService.mediumTemperatureRun(area));
		model.addAttribute("weather",mediumService.mediumWeatherRun(area));
	}
	
	//단기 컨트론러
	@GetMapping("/ShortWeather")
	public void Short() {
//		System.out.println("미디움테스트");
//		model.addAttribute("shortweather",shortService.shortWeatherRun());
	}
	//단기 검색어
	
	//단기 삽입 
	@PostMapping("/NewInsert")
	public void newInsert() {
		System.out.println("단기불러오기");
		shortService.shortWeatherRun();
//		model.addAttribute("shortInsert",shortService.shortWeatherRun());
	}
}
