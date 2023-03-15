package com.creational.design.patterns.decorator.pattern;

public class ChickenPizzaDecorator extends PizzaDecorator {

	public ChickenPizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	public void createPizza() {
		super.createPizza();
		System.out.println("Adding Chicken toppings to the Pizza");
	}

}
