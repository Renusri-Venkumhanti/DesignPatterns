package com.creational.design.patterns.decorator.pattern;

public class VeggiePizzaDecorator extends PizzaDecorator {

	public VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	public void createPizza() {
		super.createPizza();
		System.out.println("Adding Veggies toppings to the Pizza");
	}

}
