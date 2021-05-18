package com.hs.s1.lang.weather;

public class WeatherMain {

	public static void main(String[] args) {

//		WeatherInfo weatherInfo = new WeatherInfo();
//		WeatherDTO[] weatherDTOs = weatherInfo.makeWeather();
//		WeatherView weatherView = new WeatherView();
//		weatherView.view(weatherDTOs);

		WeatherController weatherController = new WeatherController();
		weatherController.start();

	}
}
