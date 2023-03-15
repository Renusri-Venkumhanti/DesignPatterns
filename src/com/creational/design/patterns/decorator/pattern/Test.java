package com.creational.design.patterns.decorator.pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza piza = new ChickenPizzaDecorator( new VeggiePizzaDecorator(new NormalPiza()));
		piza.createPizza();

	}

}
