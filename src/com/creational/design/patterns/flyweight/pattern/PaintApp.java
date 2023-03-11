package com.creational.design.patterns.flyweight.pattern;

public class PaintApp {

	ShapeFactory sc = new ShapeFactory();
	public void drawShapes(int num) {
		for(int i=1; i<=num;i++) {
			Shape s = null;
			if(i%2==0) {
				s = sc.createShape("circle");
				s.draw(i+"", "blue");
			}
			else {
				s = sc.createShape("rectangle");
				s.draw(i+"",i+1+"" ,"red");
			}
		}
	}
}
