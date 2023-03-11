package com.creational.design.patterns.flyweight.pattern;

public  class Rectangle extends Shape {


	String label;
	public Rectangle() {
		label ="Rectangle";
	}
	@Override
	public void draw(String length, String breadth, String color) {
		// TODO Auto-generated method stub
		System.out.println("Drawing a "+label+ " with length: "+length+ " with breadth: "+breadth+ " and with color: "+color);
	}

}
