package com.creational.design.patterns.facade.pattern;

public class FacadeClass {

	public void processOrder(String name, String price) {
		OrderProcessor op = new OrderProcessor();
		if(op.checkStock(name)) {
			String orderId = op.confirmOrder(name, price);
			op.shipOrder(orderId);
		}
	}
}
