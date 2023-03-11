package com.creational.design.patterns.adapter.pattern;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int findWeather(String city) {
		if(city=="hyd")
		return 35;
		else 
			return 45;
	}

}
