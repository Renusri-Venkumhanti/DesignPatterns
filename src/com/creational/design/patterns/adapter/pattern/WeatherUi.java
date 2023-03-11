package com.creational.design.patterns.adapter.pattern;

public class WeatherUi {
	int find(int zipCode) {
		WeatherAdapter wa = new WeatherAdapter();
		return wa.findWeather(zipCode);
		
	}

}
