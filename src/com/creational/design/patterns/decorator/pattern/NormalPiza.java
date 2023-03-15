package com.creational.design.patterns.decorator.pattern;

public class NormalPiza implements Pizza {

	@Override
	public void createPizza() {
		System.out.println("Creating normal pizza");
	}

}
