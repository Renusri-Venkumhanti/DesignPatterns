package com.creational.design.patterns.factory.pattern;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing Veggie PIzza");
		
	}

	@Override
	public void bake() {
		System.out.println("Baking Veggie PIzza");
		
	}

	@Override
	public void cut() {
		System.out.println("Cutting Veggie PIzza");
		
	}

}
