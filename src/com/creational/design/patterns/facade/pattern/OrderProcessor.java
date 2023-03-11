package com.creational.design.patterns.facade.pattern;

public class OrderProcessor {
	public boolean checkStock(String name) {
		if(name.equals("pen"))
			return true;
		return false;
	}
	public String confirmOrder(String name, String price) {
		System.out.println("Name :"+name+" Price:"+price);
		return (int)(Math.random()*100) +"";
	}
	public void shipOrder(String orderId) {
		System.out.println("Shipping order :"+orderId);
	}

}
