package com.creational.design.patterns.factory.pattern;

public class ChickenPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing chicken PIzza");
		
	}

	@Override
	public void bake() {
		System.out.println("Baking chicken PIzza");
		
	}

	@Override
	public void cut() {
		System.out.println("Cutting chicken PIzza");
		
	}

}
