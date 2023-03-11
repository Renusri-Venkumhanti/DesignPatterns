package com.creational.design.patterns.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	
	Map<String, Shape> map = new HashMap<>();
	Shape shape = null;
	
	public Shape createShape(String type) {

		if(map.get(type)!= null)
			shape =  map.get(type);
		else {
			if(type=="circle") {
				shape = new Circle();
			}else if (type=="rectangle") {
				shape = new Rectangle();
			}
			map.put(type , shape);
		}
		System.out.println("\n"+shape.hashCode());
		System.out.println(map);
		return shape;
			
	}

}
