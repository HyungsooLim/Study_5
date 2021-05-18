package com.hs.s1.lang.weather;

public class WeatherDTO {
	// 날씨정보를 가지고 있는 Class
	// 도시명
	private String city;

	// 기온
	private String temp;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// 습도
	private String humidity;

	// 상태
	private String status;
}
