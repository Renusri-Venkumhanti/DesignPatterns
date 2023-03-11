package com.creational.design.patterns.adapter.pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherUi wu = new WeatherUi();
		System.out.println( wu.find(1009));

	}

}
