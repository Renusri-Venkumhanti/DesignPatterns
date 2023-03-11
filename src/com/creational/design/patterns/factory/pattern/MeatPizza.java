package com.creational.design.patterns.factory.pattern;

public class MeatPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing meat PIzza");
		
	}

	@Override
	public void bake() {
		System.out.println("Baking meat PIzza");
		
	}

	@Override
	public void cut() {
		System.out.println("Cutting meat PIzza");
		
	}
}
