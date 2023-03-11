package com.creational.design.patterns.factory.pattern;

public class PizzaStore {

	public void orderPizza(String type) {
		PizzaFactory p = new PizzaFactory();
		Pizza pizza = p.createPizza(type);
		pizza.prepare();pizza.bake();pizza.cut();
	}
}
