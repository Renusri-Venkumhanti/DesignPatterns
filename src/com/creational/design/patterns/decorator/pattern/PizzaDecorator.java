package com.creational.design.patterns.decorator.pattern;

public class PizzaDecorator implements Pizza {
	
	Pizza pizza;
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void createPizza() {
	pizza.createPizza();
	}

}
