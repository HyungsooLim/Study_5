package com.hs.s1.lang.weather;

import java.util.Scanner;

public class WeatherController {
	private Scanner sc;
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;

	public WeatherController() {
		sc = new Scanner(System.in);
		weatherInfo = new WeatherInfo();
		weatherView = new WeatherView();
	}
	// method : start
	// 1. 날씨 초기화 : makeWeather
	// 2. 날씨 정보 출력 : weatherView
	// 3. 프로그램 종료

	public void start() {
		boolean check = true;
		WeatherDTO[] weatherDTOs = null;
		while (check) {
			System.out.println("1. 날씨 초기화");
			System.out.println("2. 날씨 정보 출력");
			System.out.println("3. 날씨 정보 검색");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				weatherDTOs = weatherInfo.makeWeather();
				break;
			case 2:
				if (weatherDTOs != null) {
					weatherView.view(weatherDTOs);
				} else {
					weatherView.view("초기화를 먼저 진행하세요");
				}
				break;
			case 3:
				WeatherDTO weatherDTO = weatherInfo.searchWeather(weatherDTOs);
				if (weatherDTO != null) {
					weatherView.view(weatherDTO);
				} else {
					weatherView.view("일치하는 도시 없음");
				}
				break;
			case 4:
				System.out.println("---프로그램 종료---");
				check = false;
				break;
			}
		}
	}

}
