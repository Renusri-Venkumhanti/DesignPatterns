package com.creational.design.patterns.flyweight.pattern;

public class Circle extends Shape {

	String label;
	public Circle() {
		label ="Circle";
	}
	@Override
	public void draw(String radius, String color) {
		System.out.println("Drawing a "+label+ " with radius: "+radius+ " and with color: "+color);
		// TODO Auto-generated method stub

	}

}
