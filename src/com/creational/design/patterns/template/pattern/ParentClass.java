package com.creational.design.patterns.template.pattern;

public abstract class ParentClass {
	
	public void render() {
		String data = readData();
		String processedData = processedData();
		
		System.out.println("Before Procession "+data + "\nAfter Processing "+processedData);
	}
	
	public abstract String readData();
	
	public abstract String processedData();

}
