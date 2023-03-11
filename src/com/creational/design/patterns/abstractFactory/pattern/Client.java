package com.creational.design.patterns.abstractFactory.pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory fac = AbstractProvider.createFctory("xml");
		Dao dao = fac.createDao("dept");
		dao.save();

	}

}
