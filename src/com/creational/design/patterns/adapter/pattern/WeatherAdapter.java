package com.creational.design.patterns.adapter.pattern;

public class WeatherAdapter {
	int findWeather(int zipCode) {
		WeatherFinder wf = new WeatherFinderImpl();
		String city = null;
		if(zipCode == 1009)
			city = "hyd";
		return wf.findWeather(city);
	}

}
