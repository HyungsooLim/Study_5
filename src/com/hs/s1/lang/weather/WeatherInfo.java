package com.hs.s1.lang.weather;

import java.util.Scanner;

public class WeatherInfo {

	private String info;
	private Scanner sc;

	public WeatherInfo() {
		// 날씨정보 : 도시명 기온 습도 상태	
		StringBuffer sb = new StringBuffer();
		sb.append("서울 22 60% 흐림");
		sb.append(" 대전 -32 10% 맑음");
		sb.append(" 제주 45 90% 비");
		sb.append(" 부산 0 80% 눈");
		this.info=sb.toString();
		
		sc = new Scanner(System.in);
	}

	// method명 : makeWeather
	// info를 파싱해서 weatherDTO를 생성 4개
	// weatherDTO들을 리턴

	public WeatherDTO[] makeWeather() {
		String[] ar = this.info.split(" ");
		WeatherDTO[] weatherDTOs = new WeatherDTO[ar.length / 4];
		int idx = 0;
		for (int i = 0; i < ar.length / 4; i++) {
			weatherDTOs[i] = new WeatherDTO();
			weatherDTOs[i].setCity(ar[idx]);
			weatherDTOs[i].setTemp(ar[idx + 1]);
			weatherDTOs[i].setHumidity(ar[idx + 2]);
			weatherDTOs[i].setStatus(ar[idx + 3]);
			idx = idx + 4;
		}
		return weatherDTOs;
	}

	// method : searchWeather
	// 날씨정보들을 받아서
	// 검색하고자하는 도시명 입력
	// 검색된 DTO를 리턴

	public WeatherDTO searchWeather(WeatherDTO[] weatherDTOs) {
		WeatherDTO weatherDTO = null;
		System.out.println("검색 도시 입력");
		String city = sc.next();
		if (weatherDTOs != null) {
			for (int i = 0; i < weatherDTOs.length; i++) {
				if (city.equals(weatherDTOs[i].getCity())) {
					weatherDTO = weatherDTOs[i];
					break;
				}
			}
		}
		return weatherDTO;
	}

}
