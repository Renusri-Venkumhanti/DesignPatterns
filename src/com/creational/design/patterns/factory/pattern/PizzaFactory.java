package com.creational.design.patterns.factory.pattern;

public class PizzaFactory {
	Pizza pizza = null; 
	
	public Pizza createPizza(String type) {
		if(type == "veggie")
			pizza = new VeggiePizza();
		else if (type == "chicken")
			pizza = new ChickenPizza();
		else if (type == "meat")
			pizza = new MeatPizza();
		
		return pizza;
	}

}
