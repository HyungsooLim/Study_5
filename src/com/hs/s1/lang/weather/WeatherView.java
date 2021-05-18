package com.hs.s1.lang.weather;

public class WeatherView {

	public void view(String str) {
		System.out.println("==================");
		System.out.println(str);
		System.out.println("==================");
	}

	// method : view
	// WeatherDTO들을 받아서 출력
	public void view(WeatherDTO[] weatherDTOs) {
		System.out.println("City\t Temp\t Humidity\t Status");
		for (int i = 0; i < weatherDTOs.length; i++) {
			System.out.print(weatherDTOs[i].getCity() + "\t ");
			System.out.print(weatherDTOs[i].getTemp() + "\t ");
			System.out.print(weatherDTOs[i].getHumidity() + "\t\t ");
			System.out.println(weatherDTOs[i].getStatus() + "\t ");
			System.out.println("-------------------------------------------------");
		}
	}

	// method : view
	// WeatherDTO 하나를 출력
	public void view(WeatherDTO weatherDTO) {
		System.out.println("-------------------------------------------------");
		System.out.println("City\t Temp\t Humidity\t Status");
		System.out.print(weatherDTO.getCity() + "\t ");
		System.out.print(weatherDTO.getTemp() + "\t ");
		System.out.print(weatherDTO.getHumidity() + "\t\t ");
		System.out.println(weatherDTO.getStatus() + "\t ");
		System.out.println("-------------------------------------------------");

	}
}
